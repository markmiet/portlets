/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.slayer.service.impl;

import java.util.Date;

import com.slayer.model.LMSBook;
import com.slayer.model.impl.LMSBookImpl;
import com.slayer.service.LMSBookLocalServiceUtil;
import com.slayer.service.base.LMSBookLocalServiceBaseImpl;

/**
 * The implementation of the l m s book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.slayer.service.LMSBookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mietmark
 * @see com.slayer.service.base.LMSBookLocalServiceBaseImpl
 * @see com.slayer.service.LMSBookLocalServiceUtil
 */
public class LMSBookLocalServiceImpl extends LMSBookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.slayer.service.LMSBookLocalServiceUtil} to access the l m s book local service.
	 */


	public LMSBook insertBook(String bookTitle, String author) {
		LMSBook lmsBook = new LMSBookImpl();
		// 2. Generate a unique primary key to be set
		// long bookId = 0l;
		// try {
		// bookId = CounterLocalServiceUtil.increment();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// 3. Set the fields for this object
		// lmsBook.setBookId(bookId);
		lmsBook.setBookTitle(bookTitle);
		lmsBook.setAuthor(author);
		lmsBook.setCreateDate(new Date());
		// 4. Call the Service Layer API to persist the object
		try {
			lmsBook = LMSBookLocalServiceUtil.addLMSBook(lmsBook);

		} catch (Exception e)

		{
			e.printStackTrace();

		}
		return lmsBook;
	}

}