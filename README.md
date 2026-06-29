# SmartStayBackend

這是一個使用 **Spring Boot** 開發的旅館預約系統後端 API。

## 🛠️ 技術棧 (Tech Stack)
* **語言**: Java 21
* **框架**: Spring Boot 3
* **資料庫**: H2 (嵌入式資料庫)
* **資料庫存取**: Spring Data JPA
* **工具**: IntelliJ IDEA, Gradle, Git

## 🚀 功能特色
* 飯店房間資料管理 (CRUD)。
* 透過 JPA 實現高效的資料庫操作。
* 完整的 Controller-Repository-Model 分層架構。

## ⚙️ 如何執行
1. 請確保已安裝 JDK 21 以上版本。
2. 使用 IntelliJ IDEA 開啟此專案。
3. 執行 `SmartStayApplication.java` 啟動 Spring Boot。
4. 訪問 `http://localhost:8080/api/rooms/init` 初始化資料。