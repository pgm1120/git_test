<%--
  Created by IntelliJ IDEA.
  User: GGuPro
  Date: 2022-10-04
  Time: 오후 4:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Tables - SB Admin</title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="/res/css/styles.css" rel="stylesheet" />
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <!-- Navbar Brand-->
    <a class="navbar-brand ps-3" href="index.html">Start Bootstrap</a>
    <!-- Sidebar Toggle-->
    <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
    <!-- Navbar Search-->
    <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
        <div class="input-group">
            <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
            <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
        </div>
    </form>
    <!-- Navbar-->
    <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#!">Settings</a></li>
                <li><a class="dropdown-item" href="#!">Activity Log</a></li>
                <li><hr class="dropdown-divider" /></li>
                <li><a class="dropdown-item" href="#!">Logout</a></li>
            </ul>
        </li>
    </ul>
</nav>
<div id="layoutSidenav">
    <div id="layoutSidenav_nav">
        <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
            <div class="sb-sidenav-menu">
                <div class="nav">
                    <div class="sb-sidenav-menu-heading">Core</div>
                    <a class="nav-link" href="index.html">
                        <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                        Dashboard
                    </a>
                    <div class="sb-sidenav-menu-heading">Interface</div>
                    <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                        <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                        Layouts
                        <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                    </a>
                    <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                        <nav class="sb-sidenav-menu-nested nav">
                            <a class="nav-link" href="layout-static.html">Static Navigation</a>
                            <a class="nav-link" href="layout-sidenav-light.html">Light Sidenav</a>
                        </nav>
                    </div>
                    <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePages" aria-expanded="false" aria-controls="collapsePages">
                        <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                        Pages
                        <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                    </a>
                    <div class="collapse" id="collapsePages" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                        <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseAuth" aria-expanded="false" aria-controls="pagesCollapseAuth">
                                Authentication
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="pagesCollapseAuth" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordionPages">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="login.html">Login</a>
                                    <a class="nav-link" href="register.html">Register</a>
                                    <a class="nav-link" href="password.html">Forgot Password</a>
                                </nav>
                            </div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseError" aria-expanded="false" aria-controls="pagesCollapseError">
                                Error
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="pagesCollapseError" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordionPages">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="401.html">401 Page</a>
                                    <a class="nav-link" href="404.html">404 Page</a>
                                    <a class="nav-link" href="500.html">500 Page</a>
                                </nav>
                            </div>
                        </nav>
                    </div>
                    <div class="sb-sidenav-menu-heading">Addons</div>
                    <a class="nav-link" href="charts.html">
                        <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                        Charts
                    </a>
                    <a class="nav-link" href="tables.html">
                        <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                        Tables
                    </a>
                </div>
            </div>
            <div class="sb-sidenav-footer">
                <div class="small">Logged in as:</div>
                Start Bootstrap
            </div>
        </nav>
    </div>
    <div id="layoutSidenav_content">
        <main>
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">tno</th>
                    <th scope="col">title</th>
                    <th scope="col">writer</th>
                    <th scope="col">duedate</th>
                    <th scope="col">complete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pageDTO.dtoList}" var="dto">
                    <tr>
                        <td><c:out value="${dto.tno}"/></td>
                        <td><a href="/todo/read?tno=${dto.tno}"><c:out value="${dto.title}"/></a></td>
                        <td><c:out value="${dto.writer}"/></td>
                        <td><c:out value="${dto.dueDate}"/></td>
                        <td><c:out value="${dto.complete}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

                        <nav aria-label="Page navigation example">
                            <ul class="pagination">
                                <c:if test="${pageDTO.prev}">
                                    <li class="page-item"><a class="page-link" href="/todo/list?page=${pageDTO.start-1}">Previous</a></li>
                                </c:if>
                                <c:forEach begin="${pageDTO.start}" end="${pageDTO.end}" var="num">
                                    <li class="page-item"><a class="page-link" href="/todo/list?page=${num}">${num}</a></li>
                                </c:forEach>
                                <c:if test="${pageDTO.next}">
                                    <li class="page-item"><a class="page-link" href="/todo/list?page=${pageDTO.end + 1}">Next</a></li>
                                </c:if>
                            </ul>
                        </nav>
<%--                                <li class="page-item"><a class="page-link" href="#">1</a></li>--%>
<%--                                <li class="page-item"><a class="page-link" href="#">2</a></li>--%>
<%--                                <li class="page-item"><a class="page-link" href="#">3</a></li>--%>
<%--                                <li class="page-item"><a class="page-link" href="#">Next</a></li>--%>

<%--                                                <ul class="paging">--%>
<%--                                                    <c:if test="${pageDTO.prev}">--%>
<%--                                                        <li> <a href="/todo/list?page=${pageDTO.start -1}">Prev</a></li>--%>
<%--                                                    </c:if>--%>
<%--                                                    <c:forEach begin="${pageDTO.start}" end="${pageDTO.end}" var="num">--%>
<%--                                                        <li> <a href="/todo/list?page=${num}"> ${num} </a></li>--%>
<%--                                                    </c:forEach>--%>
<%--                                                    <c:if test="${pageDTO.next}">--%>
<%--                                                        <li><a href="/todo/list?page=${pageDTO.end  + 1}"> Next</a></li>--%>
<%--                                                    </c:if>--%>
<%--                                                </ul>--%>





        </main>
        <button onclick="location.href='/todo/register'">등록</button>
        <footer class="py-4 bg-light mt-auto">
            <div class="container-fluid px-4">
                <div class="d-flex align-items-center justify-content-between small">
                    <div class="text-muted">Copyright &copy; Your Website 2022</div>
                    <div>
                        <a href="#">Privacy Policy</a>
                        &middot;
                        <a href="#">Terms &amp; Conditions</a>
                    </div>
                </div>
            </div>
            <script>
                const actionForm = document.querySelector('#actionForm')

                const result = '${oper}'

                const modal = new bootstrap.Modal(document.querySelector('.modal'))

                if(result === 'true'){
                    modal.show()
                }


                document.querySelector(".pagination").addEventListener("click",(e)=> {
                    e.preventDefault()
                    e.stopPropagation()
                    const target = e.target
                    if(target.tagName !== 'A'){
                        return
                    }

                    const pageNum = target.getAttribute("href")

                    actionForm.action="/todo/list"
                    actionForm.method ="get"
                    actionForm.querySelector("input[name='page']").value = pageNum

                    actionForm.submit()

                }, false)

                document.querySelector(".table").addEventListener("click", (e) => {
                    e.preventDefault()
                    e.stopPropagation()
                    const target = e.target
                    const tno = target.getAttribute("data-tno")

                    console.log("-----------1")
                    if(!tno){
                        return
                    }
                    console.log("-----------2")


                    actionForm.action="/todo/read"
                    actionForm.method ="get"
                    let str =""
                    str += `<input type='hidden' name='tno' value='\${tno}'>`
                    str += `<input type='hidden' name='page' value='${pageRequestDTO.page}'>`

                    actionForm.innerHTML = str
                    actionForm.submit()


                },false)


            </script>



        </footer>
    </div>
</div>
<div class="modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p>Modal body text goes here.</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">Save changes</button>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<form id="actionForm" action="/todo/list" method="get">
    <input type="hidden" name="page" value="${pageRequestDTO.page}">
</form>
<script>
    const actionForm = document.querySelector('#actionForm')

    const result = '${oper}'

    const modal = new bootstrap.Modal(document.querySelector('.modal'))

    if(result === 'true'){
        modal.show()
    }


    document.querySelector(".pagination").addEventListener("click",(e)=> {
        e.preventDefault()
        e.stopPropagation()
        const target = e.target
        if(target.tagName !== 'A'){
            return
        }

        const pageNum = target.getAttribute("href")

        actionForm.action="/todo/list"
        actionForm.method ="get"
        actionForm.querySelector("input[name='page']").value = pageNum

        actionForm.submit()

    }, false)

    document.querySelector(".table").addEventListener("click", (e) => {
        e.preventDefault()
        e.stopPropagation()
        const target = e.target
        const tno = target.getAttribute("data-tno")

        console.log("-----------1")
        if(!tno){
            return
        }
        console.log("-----------2")


        actionForm.action="/todo/read"
        actionForm.method ="get"
        let str =""
        str += `<input type='hidden' name='tno' value='\${tno}'>`
        str += `<input type='hidden' name='page' value='${pageRequestDTO.page}'>`

        actionForm.innerHTML = str
        actionForm.submit()


    },false)


</script>
<script>
    const actionForm = document.querySelector('#actionForm')

    const result = '${oper}'

    const modal = new bootstrap.Modal(document.querySelector('.modal'))

    if(result === 'true'){
        modal.show()
    }


    document.querySelector(".pagination").addEventListener("click",(e)=> {
        e.preventDefault()
        e.stopPropagation()
        const target = e.target
        if(target.tagName !== 'A'){
            return
        }

        const pageNum = target.getAttribute("href")

        actionForm.action="/todo/list"
        actionForm.method ="get"
        actionForm.querySelector("input[name='page']").value = pageNum

        actionForm.submit()

    }, false)

    document.querySelector(".table").addEventListener("click", (e) => {
        e.preventDefault()
        e.stopPropagation()
        const target = e.target
        const tno = target.getAttribute("data-tno")

        console.log("-----------1")
        if(!tno){
            return
        }
        console.log("-----------2")


        actionForm.action="/todo/read"
        actionForm.method ="get"
        let str =""
        str += `<input type='hidden' name='tno' value='\${tno}'>`
        str += `<input type='hidden' name='page' value='${pageRequestDTO.page}'>`

        actionForm.innerHTML = str
        actionForm.submit()


    },false)


</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="/res/js/scripts.js"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src="/res/js/datatables-simple-demo.js"></script>

</body>
</html>
