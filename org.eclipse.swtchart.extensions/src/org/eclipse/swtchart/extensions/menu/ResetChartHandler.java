/*******************************************************************************
 * Copyright (c) 2017, 2019 Lablicate GmbH.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 * Frank Buloup - Internationalization
 *******************************************************************************/
package org.eclipse.swtchart.extensions.menu;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtchart.extensions.core.ScrollableChart;

public class ResetChartHandler extends AbstractChartMenuEntry implements IChartMenuEntry {

	@Override
	public String getCategory() {

		return IChartMenuCategories.STANDARD_OPERATION;
	}

	@Override
	public String getName() {

		return Messages.getString(Messages.RESET_CHART);
	}

	@Override
	public void execute(Shell shell, ScrollableChart scrollableChart) {

		scrollableChart.adjustRange(true);
		scrollableChart.redraw();
	}
}
