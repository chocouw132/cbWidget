package com.intland.codebeamer.dashboard.component.widgets.demo;

import java.util.Locale;

import org.springframework.stereotype.Component;

import com.intland.codebeamer.dashboard.component.common.interfaces.WidgetInformation;
import com.intland.codebeamer.dashboard.component.widgets.common.WidgetCategory;

@Component
public class DemoWidgetInformation implements WidgetInformation {

	public String getCategory() {
		return WidgetCategory.OTHER.getName();
	}

	public String getImagePreviewUrl() {
		return "";
	}

	public String getKnowledgeBaseUrl() {
		return "";
	}

	public String getVendor() {
		return "Intland";
	}

	public String getName() {
		return "dashboard.demo.widget.name";
	}

	public String getShortDescription() {
		return "dashboard.demo.widget.short.description";
	}

	public DemoWidgetFactory getFactory() {
		return null;
	}

	public String getType() {
		return DemoWidget.class.getCanonicalName();
	}
	
	@Override
    public String getKnowledgeBaseUrl(Locale locale) {
        // 메서드 구현 - 필요한 로직에 따라 URL을 반환
        return null; // 실제 URL을 반환하도록 수정
    }

}
