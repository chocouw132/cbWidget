package com.intland.codebeamer.dashboard.component.widgets.demo;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.intland.codebeamer.dashboard.component.common.RenderingContext;
import com.intland.codebeamer.dashboard.component.common.interfaces.Renderer;
import com.intland.codebeamer.dashboard.component.widgets.common.attribute.StringAttribute;

@Component
@Qualifier("demoWidgetHtmlRenderer")
public class DemoWidgetHtmlRenderer implements Renderer<DemoWidget> {

	private final String template = "<strong>{0}</strong>";

	public String render(final RenderingContext renderingContext, final DemoWidget demoWidget) {
		String greeting = "";

		final StringAttribute attribute = (StringAttribute) demoWidget.getAttributes().get(DemoWidget.Attribute.GREETING.getKey());

		if (attribute != null) {
			greeting = attribute.getValue();
		}

		return MessageFormat.format(template, greeting);
	}

}
