/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.acceleo.module.pim.uml21.gen.java.struts.migrated.ui.common;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;


/**
 * Main entry point of the 'StrutsSpringHibernate' generation module.
 */
public class GenerateAll {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(URI modelURI, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}
		
		// final URI template0 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.struts.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/struts/migrated/files/struts.emtl"));
		// org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Struts gen0 = new org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Struts(modelURI, targetFolder.getLocation().toFile(), arguments) {
		//	protected URI createTemplateURI(String entry) {
		//		return template0;
		//	}
		//};
		//gen0.doGenerate(BasicMonitor.toMonitor(monitor));
		monitor.subTask("Loading...");
		org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Main gen0 = new org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Main(modelURI, targetFolder.getLocation().toFile(), arguments);
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.struts.migrated.ui/org/acceleo/module/pim/uml21/gen/java/struts/migrated/ui/popupMenus/basic.properties");
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.common.migrated/org/acceleo/module/pim/uml21/gen/java/common/stereotypes.properties");
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.common.migrated/org/acceleo/module/pim/uml21/gen/java/common/default.properties");
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.common.migrated/org/acceleo/module/pim/uml21/gen/java/common/java.properties");
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.common.migrated/org/acceleo/module/pim/uml21/dao.properties");
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.common.migrated/org/acceleo/module/pim/uml21/dto.properties");
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.common.migrated/org/acceleo/module/pim/uml21/hibernate.properties");
		gen0.addPropertiesFile("platform:/plugin/org.acceleo.module.pim.uml21.gen.java.common.migrated/org/acceleo/module/pim/uml21/profile.properties");
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.struts.migrated", "org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Struts", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));
			
		
	}
	
	/**
	 * Finds the template in the plug-in. Returns the template plug-in URI.
	 * 
	 * @param bundleID
	 *            is the plug-in ID
	 * @param relativePath
	 *            is the relative path of the template in the plug-in
	 * @return the template URI
	 * @throws IOException
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private URI getTemplateURI(String bundleID, IPath relativePath) throws IOException {
		Bundle bundle = Platform.getBundle(bundleID);
		if (bundle == null) {
			// no need to go any further
			return URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		URL url = bundle.getEntry(relativePath.toString());
		if (url == null && relativePath.segmentCount() > 1) {
			Enumeration<URL> entries = bundle.findEntries("/", "*.emtl", true);
			if (entries != null) {
				String[] segmentsRelativePath = relativePath.segments();
				while (url == null && entries.hasMoreElements()) {
					URL entry = entries.nextElement();
					IPath path = new Path(entry.getPath());
					if (path.segmentCount() > relativePath.segmentCount()) {
						path = path.removeFirstSegments(path.segmentCount() - relativePath.segmentCount());
					}
					String[] segmentsPath = path.segments();
					boolean equals = segmentsPath.length == segmentsRelativePath.length;
					for (int i = 0; equals && i < segmentsPath.length; i++) {
						equals = segmentsPath[i].equals(segmentsRelativePath[i]);
					}
					if (equals) {
						url = bundle.getEntry(entry.getPath());
					}
				}
			}
		}
		URI result;
		if (url != null) {
			result = URI.createPlatformPluginURI(new Path(bundleID).append(new Path(url.getPath())).toString(), false);
		} else {
			result = URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		return result;
	}

}
