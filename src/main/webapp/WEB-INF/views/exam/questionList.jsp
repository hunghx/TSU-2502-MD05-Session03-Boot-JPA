<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 20/08/2025
  Time: 8:47 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh Sách Bài Thi</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f5f5f5;
            padding: 20px;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            background: white;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }

        .table-container {
            background: white;
            border-radius: 10px;
            overflow: hidden;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        thead {
            background: #4CAF50;
        }

        thead th {
            color: white;
            padding: 15px;
            text-align: left;
            font-weight: 600;
        }

        tbody tr {
            border-bottom: 1px solid #eee;
        }

        tbody tr:hover {
            background-color: #f9f9f9;
        }

        tbody td {
            padding: 15px;
            color: #333;
        }

        .action-btn {
            background: #4CAF50;
            color: white;
            border: none;
            padding: 8px 16px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 0.9em;
            text-decoration: none;
            display: inline-block;
        }

        .action-btn:hover {
            background: #45a049;
        }

        .pagination {
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 10px;
            padding: 20px;
            background: #f8f9fa;
        }

        .pagination a {
            display: flex;
            align-items: center;
            justify-content: center;
            width: 40px;
            height: 40px;
            border-radius: 4px;
            background: #fff;
            color: #333;
            text-decoration: none;
            font-weight: 500;
            border: 1px solid #ddd;
        }

        .pagination a:hover {
            background: #4CAF50;
            color: white;
            border-color: #4CAF50;
        }

        .pagination a.active {
            background: #4CAF50;
            color: white;
            border-color: #4CAF50;
        }

        @media (max-width: 768px) {
            .container {
                margin: 10px;
                border-radius: 5px;
            }

            .table-container {
                overflow-x: auto;
            }

            table {
                min-width: 600px;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Danh sách câu hỏi</h1>
    <h2>Bài thi : ${examTitle}</h2>
    <a href="">Thêm mới câu hỏi</a>
    <div class="table-container">
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Nội dung</th>
                <th>Hành động</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${questions}" var="question">
                <tr>
                    <td>${question.id}</td>
                    <td>${question.content}</td>
                    <td><a href="#" class="action-btn">Xem chi tiết</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


</div>
</body>
</html>