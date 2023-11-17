<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chatbot Example</title>
</head>
<body>

    <!-- Include jQuery library -->
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

    <!-- Script to handle chatbot icon click -->
    <script>
        function openChat() {
            // Send a request to the ChatServlet on icon click
            $.get('ChatServlet', function(data) {
                // Handle the response, if needed
            });
        }
    </script>

    <!-- Chatbot icon -->
    <div id="chatIcon" style="position: fixed; bottom: 10px; right: 10px; cursor: pointer;">
        <img src="https://unlimitedchatbot.com/wp-content/uploads/2022/03/chatbot-marketing.gif" width="50" height="50" onclick="openChat()">
    </div>

</body>
</html>
