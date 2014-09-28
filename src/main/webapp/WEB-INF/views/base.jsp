<h1>List of All Sections</h1>
<p>Here you can see the list of the teams, edit them, remove or update.</p>
<p>
${message}<br>
</p>
<table border="1px" cellpadding="0" cellspacing="0">
    <thead>
        <tr>
            <th width="10%">id</th>
            <th width="15%">name</th>
            <th width="10%">description</th>
            <th width="10%">actions</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="section" items="${sections}">
    <tr>
        <td>${section.id}</td>
        <td>${section.name}</td>
        <td>${section.description}</td>
        <td>
            <a href="${pageContext.request.contextPath}/section/edit/${section.id}">Edit</a><br>
            <a href="${pageContext.request.contextPath}/section/delete/${section.id}">Delete</a><br>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<p>
<a href = "${pageContext.request.contextPath}/section/add">add a section</a><br>
</p>
