package org.webguitoolkit.test.page;

import org.webguitoolkit.ui.controls.Page;

public class Index extends Page{
	
	protected void pageInit() {
		addHeaderCSS("./wgt-resources/standard_theme.css");
		
		// TODO: write your code here
		getFactory().createLabel(this, "Hello webguitoolkit-archetype");
	}

	protected String title() {
		return "webguitoolkit-archetype";
	}
}