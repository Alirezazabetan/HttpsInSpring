package com.example.demo.web;

import com.example.demo.domain.ReqInputDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@RestController
@RequestMapping("/api")
public class Rest {

    @PostMapping(value = "/redirect" , headers = {"content-type=application/x-www-form-urlencoded"})
    public RedirectView crConyMaster( @RequestBody String reqInputDTO,RedirectAttributes attributes) {
        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
        attributes.addAttribute("attribute", "redirectWithRedirectView");
        String url= convert(reqInputDTO);
        RedirectView ss = new RedirectView(url);
        ss.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
        return ss;
    }

    @PostMapping(value = "/redirect")
    public RedirectView redirect( @RequestBody ReqInputDTO reqInputDTO,RedirectAttributes attributes) {
        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
        attributes.addAttribute("attribute", "redirectWithRedirectView");
        String url= convert(reqInputDTO);
        RedirectView ss = new RedirectView(url);
        ss.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
        return ss;
    }

    private String convert(ReqInputDTO reqInputDTO) {
        StringBuilder str = new StringBuilder();
        str.append("https://digital.axa.com.my/travel-insurance-malaysia?");
        str.append("utm_source="+reqInputDTO.getUtm_source());
        str.append("utm_medium="+reqInputDTO.getUtm_medium());
        str.append("utm_campaign="+reqInputDTO.getUtm_campaign());
        str.append("ttrip="+reqInputDTO.getTtrip());
        str.append("tplan="+reqInputDTO.getTplan());
        str.append("start="+reqInputDTO.getStart());
        str.append("stop="+reqInputDTO.getStop());
        str.append("dest="+reqInputDTO.getDest());
        str.append("chc="+reqInputDTO.getChc());
        str.append("plan="+reqInputDTO.getPlan());
        str.append("country="+reqInputDTO.getCountry());
        return str.toString();
    }

    private String convert(String reqInputDTO) {

        StringBuilder str = new StringBuilder();
        str.append("https://digital.axa.com.my/travel-insurance-malaysia?");
        str.append(reqInputDTO);
//        str.append("utm_source="+reqInputDTO.getUtm_source());
//        str.append("utm_medium="+reqInputDTO.getUtm_medium());
//        str.append("utm_campaign="+reqInputDTO.getUtm_campaign());
//        str.append("ttrip="+reqInputDTO.getTtrip());
//        str.append("tplan="+reqInputDTO.getTplan());
//        str.append("start="+reqInputDTO.getStart());
//        str.append("stop="+reqInputDTO.getStop());
//        str.append("dest="+reqInputDTO.getDest());
//        str.append("chc="+reqInputDTO.getChc());
//        str.append("plan="+reqInputDTO.getPlan());
//        str.append("country="+reqInputDTO.getCountry());
        return str.toString();
    }

    private String markdownToHtml(String url) {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
//            engine.eval(showdownJs);
            engine.eval("window.location.href = '"+url+"';");
            return (String) engine.get("html");
        } catch (ScriptException e) {
            // Shouldn't happen unless somebody breaks the script
            throw new RuntimeException(e);
        }
    }

    private String result(String url) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("		<head>\r\n")
                .append("			<title>Form input</title>\r\n")
                .append("		</head>\r\n")
                .append("		<body>\r\n")
                .append("			<form id=\"myForm\" action=\"" + url + "\" target=\"_self\" method=\"Get\">\r\n")
                .append("			</form>\r\n")
                .append("		</body>\r\n")
                .append("</html>\r\n")
                .append("<script type=\"text/javascript\">")
                .append("window.onload=function(){")
                .append("document.forms[\"myForm\"].submit();")
                .append("}")
                .append("</script>");
        return stringBuffer.toString();

    }
}
