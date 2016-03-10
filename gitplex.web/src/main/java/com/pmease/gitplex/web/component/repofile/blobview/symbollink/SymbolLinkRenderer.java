package com.pmease.gitplex.web.component.repofile.blobview.symbollink;

import com.pmease.gitplex.web.component.repofile.blobview.BlobRenderer;
import com.pmease.gitplex.web.component.repofile.blobview.BlobViewContext;
import com.pmease.gitplex.web.component.repofile.blobview.BlobViewPanel;

public class SymbolLinkRenderer implements BlobRenderer {

	@Override
	public BlobViewPanel render(String panelId, BlobViewContext context, String clientState) {
		if (context.getBlobIdent().isSymbolLink())
			return new SymbolLinkPanel(panelId, context);
		else
			return null;
	}

}
