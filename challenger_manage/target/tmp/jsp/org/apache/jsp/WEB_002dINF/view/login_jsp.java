/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.10.v20150310
 * Generated at: 2017-01-04 07:51:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("jar:file:/C:/Users/user/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/fmt.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("/WEB-INF/tld/fn.tld", Long.valueOf(1476771896061L));
    _jspx_dependants.put("/WEB-INF/common/jspHeader.jsp", Long.valueOf(1476771895952L));
    _jspx_dependants.put("/WEB-INF/tld/c.tld", Long.valueOf(1476771896046L));
    _jspx_dependants.put("file:/C:/Users/user/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1482982803759L));
    _jspx_dependants.put("file:/C:/Users/user/.m2/repository/org/apache/tiles/tiles-jsp/3.0.5/tiles-jsp-3.0.5.jar", Long.valueOf(1466404051296L));
    _jspx_dependants.put("/WEB-INF/tld/spring-form.tld", Long.valueOf(1476771896061L));
    _jspx_dependants.put("jar:file:/C:/Users/user/.m2/repository/org/apache/tiles/tiles-jsp/3.0.5/tiles-jsp-3.0.5.jar!/META-INF/tld/tiles-jsp.tld", Long.valueOf(1411313530000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/common/jspHeader.jsp(14,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("currentURI");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_005fset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_005fset_005f0.doInitBody();
        }
        do {
          out.print(request.getServletPath() );
          int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("<div class=\"container\">\n");
      out.write("<br><br><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<form class=\"form-horizontal\" method=\"get\" action=\"/login\">\t\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"col-md-offset-2 col-md-2 control-label\"></label>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<h1>Challenger_manage</h1>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"col-md-offset-2 col-md-2 control-label\">用户名</label>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<input id=\"userNameTxt\" name=\"login_name\" class=\"form-control\" placeholder=\"请输入用户名\" required autofocus>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"col-md-offset-2  col-md-2 control-label\">密码</label>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"请输入密码\" required />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<div class=\"col-md-offset-4 col-md-4\">\n");
      out.write("\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t<label> <input type=\"checkbox\" id=\"rememberMeChk\" name=\"rememberMe\"/>下次自动登陆\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<div class=\"col-md-offset-4 col-md-4\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" id=\"loginBtn\">登录了哦</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("//自动登录\n");
      out.write("$().ready(function(){\n");
      out.write("\t//记住用户账户\n");
      out.write("\t$(\"#rememberMeChk\").click(function(){\n");
      out.write("\t\tif($(this).prop(\"checked\")){\n");
      out.write("\t\t\t$.setLocalStorage(\"loginId\",$(\"#userNameTxt\").val());\n");
      out.write("\t\t\t$.setLocalStorage(\"password\",$(\"#password\").val());\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t$.removeLocalStorage(\"loginId\");\n");
      out.write("\t\t\t$.removeLocalStorage(\"password\");\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("\t//检查是否要自动登录\n");
      out.write("\tif($.getLocalStorage(\"loginId\") && $.getLocalStorage(\"password\")){\n");
      out.write("\t\t$(\"#rememberMeChk\").prop(\"checked\",true);\n");
      out.write("\t\t$(\"#userNameTxt\").val($.getLocalStorage(\"loginId\"));\n");
      out.write("\t\t$(\"#password\").val($.getLocalStorage(\"password\"));\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#loginBtn\").text(\"登录中...\");\n");
      out.write("\t\tsetTimeout(function(){\n");
      out.write("\t\t\t$(\"#loginBtn\").click();\n");
      out.write("\t\t},2000)\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("})\n");
      out.write("\n");
      out.write("</script>");
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

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/common/jspHeader.jsp(16,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("imgs");
    // /WEB-INF/common/jspHeader.jsp(16,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/common/jspHeader.jsp(16,0) '/resources/img'",_el_expressionfactory.createValueExpression("/resources/img",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }
}
