<%--
  Created by IntelliJ IDEA.
  User: cpzhr
  Date: 2022-10-12
  Time: 오후 7:55
  To change this template use File | Settings | File Templates.
--%>
<%@include file="layout/header.jsp"%>
<form>
    <div class="form-group">
        <label for="exampleFormControlInput1">Title</label>
        <input type="email" class="form-control" id="exampleFormControlInput1" value="<c:out value= "${readDTO.title}"/>" readonly>
    </div>
    <div class="form-group">
        <label for="exampleFormControlInput1">Writer</label>
        <input type="email" class="form-control" id="exampleFormControlInput2"  value="<c:out value= "${readDTO.writer}"/>" readonly>
    </div>
    <div class="form-group">
        <label for="exampleFormControlInput1">Memo</label>
        <input type="email" class="form-control" id="exampleFormControlInput3"  value="<c:out value= "${readDTO.memo}"/>" readonly>
    </div>
    <div class="form-group">
        <label for="exampleFormControlInput1">DueDate</label>
        <input type="email" class="form-control" id="exampleFormControlInput4"  value="<c:out value= "${readDTO.dueDate}"/>" readonly>
    </div>
    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <div class="input-group-text">
                <label for="exampleFormControlInput1">Complete</label>
                <c:if test="${readDTO.complete}">
                <input type="checkbox" aria-label="Checkbox for following text input"  readonly  checked onclick="return false"/>
                </c:if>
                <c:if test="${!readDTO.complete}">
                    <input type="checkbox" aria-label="Checkbox for following text input"  readonly onclick="return false"/>
                </c:if>
            </div>
        </div>
        <input type="text" class="form-control" aria-label="Text input with checkbox">
    </div>
</form>


<%@include file="layout/footer.jsp"%>
