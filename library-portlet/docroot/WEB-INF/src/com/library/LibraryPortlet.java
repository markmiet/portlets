package com.library;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.slayer.model.LMSBook;
import com.slayer.model.impl.LMSBookImpl;
import com.slayer.service.LMSBookLocalServiceUtil;

/**
 * Portlet implementation class LibraryPortlet
 */
public class LibraryPortlet extends MVCPortlet {
	public void updateBook(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		String bookTitle = ParamUtil.getString(actionRequest, "bookTitle");
		String author =

		ParamUtil.getString(actionRequest, "author");
		// System.out.println("Your inputs ==> " + bookTitle + ", " + author);
		// 1. Instantiate an empty object of type LMSBookImpl
		//insertBook(bookTitle, author);
		LMSBookLocalServiceUtil.insertBook(bookTitle, author);
		// redirect after insert
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		PortletConfig portletConfig = (PortletConfig) actionRequest
				.getAttribute("javax.portlet.config");
		String portletName = portletConfig.getPortletName();
		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
				portletName + "_WAR_" + portletName + "portlet",
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		successPageURL.setParameter("jspPage", LibraryConstants.PAGE_SUCCESS);

	}


}
