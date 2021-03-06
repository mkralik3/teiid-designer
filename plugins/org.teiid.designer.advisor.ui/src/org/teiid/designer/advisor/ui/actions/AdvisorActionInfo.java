/*
 * JBoss, Home of Professional Open Source.
*
* See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
*
* See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
*/
package org.teiid.designer.advisor.ui.actions;

import org.eclipse.core.commands.AbstractHandler;

public class AdvisorActionInfo {
	private static final String NULL_STRING = null;
	private String id;
	private String displayName;
	private String shortDisplayName;
	private String description;
	private String imageId;
	private boolean isSubMenu;
	
	AbstractHandler actionHandler;
	
	protected AdvisorActionInfo(String id, String displayName, String shortDisplayName, String description) {
		super();
		this.id = id;
		this.displayName = displayName;
		this.shortDisplayName = shortDisplayName;
		this.description = description;
	}
	
	protected AdvisorActionInfo(String id, String displayName) {
		this(id, displayName, displayName, NULL_STRING);
	}
	
	public AdvisorActionInfo(String id, String displayName, AbstractHandler actionHandler) {
		this(id, displayName, displayName, NULL_STRING);
		this.actionHandler = actionHandler;
	}
	
	public AdvisorActionInfo(String id, String displayName, String shortDisplayName, AbstractHandler actionHandler) {
		this(id, displayName, shortDisplayName, NULL_STRING);
		this.actionHandler = actionHandler;
	}

	public String getId() {
		return this.id;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public String getShortDisplayName() {
		return this.shortDisplayName;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}

	public AbstractHandler getActionHandler() {
		return this.actionHandler;
	}

	public void setActionHandler(AbstractHandler actionHandler) {
		this.actionHandler = actionHandler;
	}

	public boolean isSubMenu() {
		return this.isSubMenu;
	}

	public void setIsSubMenu(boolean isSubMenu) {
		this.isSubMenu = isSubMenu;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("AdvisorActionInfo"); //$NON-NLS-1$
		sb.append("\n   Display Name = ").append(this.displayName); //$NON-NLS-1$
		if( shortDisplayName != null ) {
			sb.append("\n   Short Name = ").append(this.shortDisplayName); //$NON-NLS-1$
		}
		if( imageId != null ) {
			sb.append("\n   Image ID = ").append(this.imageId);  //$NON-NLS-1$
		}
		return sb.toString();
	}
	
	
}
