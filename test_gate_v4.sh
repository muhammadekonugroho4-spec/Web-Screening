#!/bin/bash
# test_gate_v4.sh — end-to-end test AD GATE v4 (sesuai PROMPT_AD_GATE_V4.md §3)
set -e
cd /home/kaltaraid/Documents/WEB-SCREENING

echo "=== Starting Streamlit server ==="
for pid in $(pgrep -f "streamlit run"); do kill -9 $pid 2>/dev/null || true; done
sleep 2

.venv/bin/python -m streamlit run app.py --server.headless true --server.port 8720 > /tmp/opencode/st8720.log 2>&1 &
SERVER_PID=$!

echo "Waiting for server..."
for i in {1..30}; do
    if curl -s -m 2 -o /dev/null http://localhost:8720/ 2>/dev/null; then
        echo "Server ready!"
        break
    fi
    sleep 1
done

echo "=== Running Playwright test ==="
timeout 120 .venv/bin/python -c "
from playwright.sync_api import sync_playwright
import time

with sync_playwright() as p:
    b = p.firefox.launch(headless=True)
    pg = b.new_page(viewport={'width':1200,'height':900})

    print('1. Opening gate page...')
    pg.goto('http://localhost:8720', wait_until='load', timeout=40000)
    for _w in range(20):
        time.sleep(2)
        if 'Klik Untuk Masuk' in pg.inner_text('body'):
            break

    # Verify gate is shown
    txt = pg.inner_text('body')
    assert 'Klik Untuk Masuk' in txt, 'Gate not shown'
    print('PASS: Gate rendered')

    # Find smartlink button
    link = pg.query_selector('#smartlink-btn')
    assert link, 'Smartlink button not found'
    print('PASS: Smartlink button found')

    # Click button (opens new tab)
    print('2. Clicking smartlink button...')
    with pg.context.expect_page() as new_page_info:
        link.click()

    new_page = new_page_info.value
    time.sleep(3)

    # Verify new tab opened smartlink
    print('PASS: Smartlink opened in new tab:', new_page.url[:60])

    # Go back to original tab
    print('3. Waiting for auto-unlock or manual button...')
    pg.bring_to_front()

    unlocked = False
    for i in range(15):
        time.sleep(1)
        txt = pg.inner_text('body')
        if 'Market Overview' in txt or 'Beranda' in txt or ('Masuk Aplikasi' not in txt and 'Login' in txt):
            print('PASS: App unlocked after', i+1, 'seconds')
            unlocked = True
            break

    if not unlocked:
        # cek tombol manual
        manual_btn = pg.query_selector('button:has-text(\"Cek Manual\")')
        if manual_btn:
            manual_btn.click()
            time.sleep(3)
            txt = pg.inner_text('body')
            if 'Market Overview' in txt or 'Beranda' in txt:
                print('PASS: Manual check worked')
                unlocked = True

    assert unlocked, 'Unlock failed (auto & manual)'
    pg.screenshot(path='/tmp/opencode/gate_v4_success.png')
    print('PASS: Test complete! Screenshot: /tmp/opencode/gate_v4_success.png')
    b.close()
"

echo "=== Cleaning up ==="
kill $SERVER_PID 2>/dev/null || true
for pid in $(pgrep -f "streamlit run"); do kill -9 $pid 2>/dev/null || true; done
sleep 1

echo "=== TEST COMPLETE ==="
