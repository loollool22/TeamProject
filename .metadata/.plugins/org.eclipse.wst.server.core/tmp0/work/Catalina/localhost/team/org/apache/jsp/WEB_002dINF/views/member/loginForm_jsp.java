/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-07-15 08:41:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>BS RESERVATION</title>\r\n");
      out.write("   <link href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/img/logo_1m.png\" rel=\"shortcut icon\" type=\"image/x-icon\">\r\n");
      out.write("	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("	<title>HM FUTSAL PARK</title>\r\n");
      out.write("	<meta name=\"keywords\" content=\"HM FUTSAL PARK\">\r\n");
      out.write("	<meta name=\"description\" content=\"\">\r\n");
      out.write("	<meta property=\"og:type\" content=\"website\">\r\n");
      out.write("	<meta property=\"og:image\" content=\"https://hmfutsalpark.com/images/common/link_profile.png\">\r\n");
      out.write("	<meta property=\"og:title\" content=\"HM FUTSAL PARK\">\r\n");
      out.write("	<meta property=\"og:description\" content=\"\">\r\n");
      out.write("	<meta property=\"og:url\" content=\"https://hmfutsalpark.com\">\r\n");
      out.write("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=chrome\">\r\n");
      out.write("\r\n");
      out.write("	<!-- 공통css -->\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/css/common.css\">\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-57x57.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-60x60.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-72x72.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-76x76.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-114x114.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-120x120.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-144x144.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-152x152.png\">\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/apple-icon-180x180.png\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" sizes=\"192x192\"  href=\"");
      out.print(request.getContextPath() );
      out.write("resources/loginimg/android-icon-192x192.png\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/favicon-32x32.png\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/favicon-96x96.png\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/favicon-16x16.png\">\r\n");
      out.write("	<link rel=\"manifest\" href=\"/favicon/manifest.json\">\r\n");
      out.write("	<meta name=\"msapplication-TileColor\" content=\"#2c3c57\">\r\n");
      out.write("	<meta name=\"msapplication-TileImage\" content=\"");
      out.print(request.getContextPath() );
      out.write("/resources/loginimg/ms-icon-144x144.png\">\r\n");
      out.write("	<meta name=\"theme-color\" content=\"#2c3c57\">\r\n");
      out.write("	<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\">\r\n");
      out.write("	<!--[if lt IE 9]><script type=\"text/javascript\" src=\"/js/libs/html5.js\"></script><![endif]-->\r\n");
      out.write("	<!--[if lt IE 9]><script type=\"text/javascript\" src=\"/js/libs/respond.min.js\"></script><![endif]-->\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/resources/js/libs/jquery.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/resources/js/common/common.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/resources/js/common/form_check.js\"></script>\r\n");
      out.write("	<!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("	<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-116234591-1\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("	  window.dataLayer = window.dataLayer || [];\r\n");
      out.write("	  function gtag(){dataLayer.push(arguments);}\r\n");
      out.write("	  gtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("	  gtag('config', 'UA-116234591-1');\r\n");
      out.write("	</script>\r\n");
      out.write("	<!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/css/content.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$('html').addClass('memb');\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	  // 쿠키값 읽어오기\r\n");
      out.write("	  var id = getCookie(\"Cookie_id\");\r\n");
      out.write("	  if(id){\r\n");
      out.write("	    $(\"#id\").val(id);\r\n");
      out.write("	    $(\"#idsave\").attr(\"checked\", true);\r\n");
      out.write("	  }\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function OLoginM() { \r\n");
      out.write("	var str = EmptyChk(document.frmLogin.id.value);\r\n");
      out.write("	var str2 = EmptyChk(document.frmLogin.pass.value);\r\n");
      out.write("	var mem = $('#idsave').is(\":checked\");\r\n");
      out.write("	var id = $('#id').val();\r\n");
      out.write("	\r\n");
      out.write("	if (str < 3) {\r\n");
      out.write("		alert(\"아이디를 입력하여 주십시오.\");\r\n");
      out.write("		document.frmLogin.id.focus();\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	else if (str2 < 4) {\r\n");
      out.write("		alert(\"비밀번호를 입력하여 주십시오.\");\r\n");
      out.write("		document.frmLogin.pass.focus();\r\n");
      out.write("		return false; \r\n");
      out.write("	}else if(mem){\r\n");
      out.write("		setCookie(\"Cookie_id\", id, 7);\r\n");
      out.write("	}else{\r\n");
      out.write("		deleteCookie(\"Cookie_id\");\r\n");
      out.write("	}\r\n");
      out.write("	document.frmLogin.submit();\r\n");
      out.write("}\r\n");
      out.write("function setCookie(cookieName, value, exdays){\r\n");
      out.write("	  var exdate = new Date();\r\n");
      out.write("	  exdate.setDate(exdate.getDate() + exdays);	// 쿠키 저장 기간\r\n");
      out.write("	  var cookieValue = escape(value) + ((exdays==null) ? \"\" : \"; expires=\" + exdate.toGMTString());\r\n");
      out.write("	  document.cookie = cookieName + \"=\" + cookieValue;\r\n");
      out.write("	}\r\n");
      out.write("function getCookie(cookieName) {\r\n");
      out.write("	  cookieName = cookieName + '=';\r\n");
      out.write("	  var cookieData = document.cookie;\r\n");
      out.write("	  var start = cookieData.indexOf(cookieName);\r\n");
      out.write("	  var cookieValue = '';\r\n");
      out.write("	  \r\n");
      out.write("	  if(start != -1){\r\n");
      out.write("	    start += cookieName.length;\r\n");
      out.write("	    var end = cookieData.indexOf(';', start);\r\n");
      out.write("	  if(end == -1)end = cookieData.length;\r\n");
      out.write("	  	cookieValue = cookieData.substring(start, end);\r\n");
      out.write("	  }\r\n");
      out.write("	  return unescape(cookieValue);\r\n");
      out.write("	}\r\n");
      out.write("function deleteCookie(cookieName){\r\n");
      out.write("	  var expireDate = new Date();\r\n");
      out.write("	  expireDate.setDate(expireDate.getDate() - 1);\r\n");
      out.write("	  document.cookie = cookieName + \"= \" + \"; expires=\" + expireDate.toGMTString();\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\"> \r\n");
      out.write("\r\n");
      out.write("	<section id=\"container\">\r\n");
      out.write("		<!-- Contents -->\r\n");
      out.write("		<form name=frmLogin id=\"login_ok.asp\" action=\"");
      out.print(request.getContextPath() );
      out.write("/member/loginPro\" method=\"post\">\r\n");
      out.write("			<input type=hidden name=c_type value=\"\">\r\n");
      out.write("		<div class=\"content\">\r\n");
      out.write("			<div class=\"member_wrap\">\r\n");
      out.write("				<div class=\"login_wrap\">\r\n");
      out.write("					<dl>\r\n");
      out.write("						<dt><label for=\"id\">아이디</label></dt>\r\n");
      out.write("						<dd><input type=text id=\"id\" name=\"id\" value=\"\" size='120' maxlength='120' style='width:100%' placeholder='이메일' tabindex=1 onkeypress=\"if(event.keyCode == 13){ OLoginM(); return;}\"></dd>\r\n");
      out.write("						<dt><label for=\"pass\">패스워드</label></dt>\r\n");
      out.write("						<dd><input type=password name='pass' value=\"\" size='12' maxlength='50' style='width:100%' placeholder='비밀번호' tabindex=2 onkeypress=\"if(event.keyCode == 13){ OLoginM(); return;}\"></dd>\r\n");
      out.write("					</dl> \r\n");
      out.write("						<span class=\"chk\"><input type=\"checkbox\" name=\"id_mem\" id=\"idsave\"><label for=\"idsave\">아이디 저장</label></span>\r\n");
      out.write("						<input type=\"button\" value=\"로그인\" onclick=\"OLoginM()\" class=\"btn_middle\">\r\n");
      out.write("<!-- 						<a href=\"#\" onclick=\"OLoginM();\" class=\"btn_middle\" >로그인</a> -->\r\n");
      out.write("					<div class=\"btn_wrap\">\r\n");
      out.write("						<a href=\"insert\" class=\"join\">회원가입</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</section>\r\n");
      out.write("	<!-- Footer -->\r\n");
      out.write("	<footer id=\"footer\">\r\n");
      out.write("		<div class=\"footer_wrap\">\r\n");
      out.write("			<span class=\"logo\"></span>\r\n");
      out.write("			<p class=\"info\">서울시 성동구 왕십리로 58 FORHU 709호(성수동 1가)<span>TEL : 02-332-7807</span><span>FAX : 02-2061-0373</span></p>\r\n");
      out.write("			<p class=\"copy\">COPYRIGHTⓒHNS. ALLRIGHT RESERVED</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- //Footer -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<iframe name=\"HiddenFrame\" style=\"display:none;\"></iframe>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
