// 等待網頁載入完成後執行
document.addEventListener('DOMContentLoaded', () => {
    const testBtn = document.getElementById('testBtn');
    const messageArea = document.getElementById('message');

    testBtn.addEventListener('click', () => {
        // 呼叫 Spring Boot 後端的 /hello 接口
        fetch('/hello')
            .then(response => {
                if (!response.ok) {
                    throw new Error('伺服器回應錯誤');
                }
                return response.text();
            })
            .then(data => {
                // 將後端回傳的字串顯示在頁面上
                messageArea.innerText = data;
                messageArea.style.color = "green";
            })
            .catch(error => {
                console.error('連線失敗:', error);
                messageArea.innerText = '連線失敗，請檢查後端是否已啟動';
                messageArea.style.color = "red";
            });
    });
});