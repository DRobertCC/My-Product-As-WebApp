<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
    <title>Subscribers</title>
    <link rel="stylesheet" href="index.css">

</head>

<body>

    <h2>Subscribers List</h2>

    <table class="lista">

        <tr>
            <th>Name</th>
            <th>Email</th>
        </tr>

        <jsp:useBean id="SUBSCRIBERS_LIST" scope="request" type="java.util.List"/>
        <c:forEach var="tempSubscriber" items="${SUBSCRIBERS_LIST}">

            <tr>
                <td> ${tempSubscriber.name} </td>
                <td> ${tempSubscriber.email} </td>
            </tr>

        </c:forEach>

    </table>
    <p><a href="index.html">Go Back</a></p>
</body>
</html>
