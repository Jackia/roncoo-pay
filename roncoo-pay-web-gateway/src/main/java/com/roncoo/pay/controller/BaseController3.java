package com.roncoo.pay.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.roncoo.xinzhongli.PageData;

/**
 * @author FH Q313596790
 * 修改时间：2015、12、11
 */
public class BaseController3 extends MultiActionController{
	
	private static final long serialVersionUID = 6357869213649815390L;
	
	/** new PageData对象
	 * @return
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**得到ModelAndView
	 * @return
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**得到request对象
	 * @return
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}

	/**得到32位的uuid
	 * @return
	 */
//	public String get32UUID(){
//		return UuidUtil.get32UUID();
//	}
//	
//	/**得到分页列表的信息
//	 * @return
//	 */
//	public Page getPage(){
//		return new Page();
//	}
//	
//	public static void logBefore(Logger logger, String interfaceName){
//		logger.info("");
//		logger.info("start");
//		logger.info(interfaceName);
//	}
//	
//	public static void logAfter(Logger logger){
//		logger.info("end");
//		logger.info("");
//	}
	
	protected void doResponse(HttpServletResponse response, String jsonStr) {
		// CLogger.debugLog(JsonResponseUtil.class.getName(), "start write",
		// jsonStr);
		response.setContentType("text/plain;charset=UTF-8");
		try {
			logger.info("返回报文-----------------------"+jsonStr);
			response.getWriter().print(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
