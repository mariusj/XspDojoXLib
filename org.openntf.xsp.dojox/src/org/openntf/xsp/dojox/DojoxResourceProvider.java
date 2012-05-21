/*
 * © Copyright Mariusz Jakubowski 2011
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package org.openntf.xsp.dojox;

import java.net.URL;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import com.ibm.xsp.resource.StyleSheetResource;
import com.ibm.xsp.webapp.resources.BundleResourceProvider;

/**
 * Resources provider factory.
 * 
 */
public class DojoxResourceProvider extends BundleResourceProvider {

	public static final String DOJOXLIB_PREFIX = ".dojoxlib"; // $NON-NLS-1$

	// Resource Path
	public static final String RESOURCE_PATH = "/.ibmxspres/.dojoxlib/";
	
	
	public static final StyleSheetResource dojoxImageCss = new StyleSheetResource(
			"/.ibmxspres/dojoroot/dojox/image/resources/image.css");

	public DojoxResourceProvider() {
		super(Activator.instance.getBundle(), DOJOXLIB_PREFIX);
		System.out.println("DojoxResourceProvider()");
	}

    @Override
	protected URL getResourceURL(HttpServletRequest request, String name) {
    	System.out.println("getResourceURL " + request + " " + name);
		String path = "/resources/web/" + name; // $NON-NLS-1$
		System.out.println("path=" + path);
		int fileNameIndex = path.lastIndexOf('/');
		String fileName = path.substring(fileNameIndex + 1);
		path = path.substring(0, fileNameIndex + 1);
		System.out.println("file=" + fileName);
		System.out.println("path2=" + path);
		// see http://www.osgi.org/javadoc/r4v42/org/osgi/framework/Bundle.html
		// #findEntries%28java.lang.String,%20java.lang.String,%20boolean%29
		Enumeration<?> urls = getBundle()
				.findEntries(path, fileName, false/* recursive */);
		if (null != urls && urls.hasMoreElements()) {
			URL url = (URL) urls.nextElement();
			System.out.println("url=" + url);
			if (null != url) {
				return url;
			}
		}
		return null; // no match, 404 not found.
	}

}
