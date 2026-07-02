# SmartStayBackend

這是一個使用 Spring Boot 開發的旅館預約系統後端 API。

## 🚀 專案介紹 (Demo)
這是一個旅館預約系統的後端 API，我採用了 Spring Boot 分層架構（Controller-Service-Repository），並實作了基礎的 CRUD 功能與全域異常處理 (Global Exception Handler)，確保系統在操作資料時的穩定性與友善的錯誤回饋。

## 🛠 技術棧 (Tech Stack)
* **語言:** Java 21
* **框架:** Spring Boot 3
* **資料庫:** PostgreSQL 16
* **資料庫存取:** Spring Data JPA
* **工具:** IntelliJ IDEA, Gradle, Git

## ✨ 功能特色
* 飯店房間資料管理 (CRUD)。
* 透過 JPA 實現高效的資料庫操作。
* 完整的 Controller-Repository-Model 分層架構。
* 全域異常處理機制，提升系統穩定性。

## ⚙️ 如何執行
1. 請確保已安裝 JDK 21 以上版本。
2. 請確保 PostgreSQL 資料庫已啟動，並在 `application.properties` 中設定正確的連線資訊。
3. 使用 IntelliJ IDEA 開啟此專案。
4. 執行 `SmartStayApplication.java` 啟動 Spring Boot。

## 🔗 API 測試指南
* **初始化測試資料**:
  `GET http://localhost:8080/api/rooms/init`
* **查詢所有房間**:
  `GET http://localhost:8080/api/rooms`
* **檢查後端連線**:
  `GET http://localhost:8080/api/rooms/test-connection`