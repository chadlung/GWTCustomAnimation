package com.giantflyingsaucer.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;


public class GWTCustomAnimation implements EntryPoint
{
	private AbsolutePanel absolutePanel = null;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		final Button runButton = new Button("Run");
		runButton.addStyleName("runButton");

	    absolutePanel = new AbsolutePanel();
	    absolutePanel.setSize("350px", "350px");
	    absolutePanel.getElement().setId("cwAbsolutePanel");
	    absolutePanel.addStyleName("absolutePanel");
	    
	    final Image img = new Image(Resources.INSTANCE.gwtLogo());
	    absolutePanel.add(img, 10, 10);

	    runButton.addClickHandler(new ClickHandler()
		{
			public void onClick(ClickEvent event)
			{
				CustomAnimation animation = new CustomAnimation(img.getElement());
				animation.scrollTo(100, 200, 2000);
			}
		});
		
		HorizontalPanel mainLayout = new HorizontalPanel();
	    mainLayout.setSpacing(10);
	    mainLayout.add(runButton);
	    mainLayout.add(absolutePanel);

	    RootPanel.get("mainDiv").add(mainLayout);
	}
}