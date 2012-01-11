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
package org.acceleo.module.pim.uml21.gen.java.struts.migrated.ui2.common;

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
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;


/**
 * Main entry point of the 'Struts Spring Hibernate' generation module.
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

	private static final String PLATFORM_PATH = "platform:/plugin/org.acceleo.module.pim.uml21.gen.java.struts.migrated.ui2";
	
	private static final String PROPERTY_FILE_PATH = GenerateAll.PLATFORM_PATH + "/org/acceleo/module/pim/uml21/gen/java/struts/migrated/ui2/common/application.properties";
	
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
		
		// final URI template0 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.common.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/common/migrated/files/main.emtl"));
		// org.acceleo.module.pim.uml21.gen.java.common.migrated.files.Main gen0 = new org.acceleo.module.pim.uml21.gen.java.common.migrated.files.Main(modelURI, targetFolder.getLocation().toFile(), arguments) {
		//	protected URI createTemplateURI(String entry) {
		//		return template0;
		//	}
		//};
		//gen0.doGenerate(BasicMonitor.toMonitor(monitor));
		monitor.subTask("Loading...");
		org.acceleo.module.pim.uml21.gen.java.common.migrated.files.Main gen0 = new org.acceleo.module.pim.uml21.gen.java.common.migrated.files.Main(modelURI, targetFolder.getLocation().toFile(), arguments);
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.common.migrated", "org.acceleo.module.pim.uml21.gen.java.common.migrated.files.Main", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));
			
		EObject model = gen0.getModel();
		if (model != null) {
				
			//final URI template1 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.dao.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/dao/migrated/files/jdbc.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Jdbc gen1 = new org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Jdbc(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template1;
			//	}
			//};
			//gen1.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Jdbc gen1 = new org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Jdbc(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.dao.migrated", "org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Jdbc", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen1.setGenerationID(generationID);
			gen1.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen1.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template2 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.dao.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/dao/migrated/files/main.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Main gen2 = new org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Main(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template2;
			//	}
			//};
			//gen2.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Main gen2 = new org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Main(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.dao.migrated", "org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Main", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen2.setGenerationID(generationID);
			gen2.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen2.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template3 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.dao.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/dao/migrated/files/memcache.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Memcache gen3 = new org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Memcache(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template3;
			//	}
			//};
			//gen3.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Memcache gen3 = new org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Memcache(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.dao.migrated", "org.acceleo.module.pim.uml21.gen.java.dao.migrated.files.Memcache", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen3.setGenerationID(generationID);
			gen3.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen3.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template4 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.hibernate.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/hibernate/migrated/files/hibernate.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.hibernate.migrated.files.Hibernate gen4 = new org.acceleo.module.pim.uml21.gen.java.hibernate.migrated.files.Hibernate(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template4;
			//	}
			//};
			//gen4.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.hibernate.migrated.files.Hibernate gen4 = new org.acceleo.module.pim.uml21.gen.java.hibernate.migrated.files.Hibernate(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.hibernate.migrated", "org.acceleo.module.pim.uml21.gen.java.hibernate.migrated.files.Hibernate", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen4.setGenerationID(generationID);
			gen4.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen4.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template5 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.spring.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/spring/migrated/files/businessLayer.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.BusinessLayer gen5 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.BusinessLayer(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template5;
			//	}
			//};
			//gen5.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.BusinessLayer gen5 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.BusinessLayer(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.spring.migrated", "org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.BusinessLayer", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen5.setGenerationID(generationID);
			gen5.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen5.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template6 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.spring.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/spring/migrated/files/springDWR.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringDWR gen6 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringDWR(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template6;
			//	}
			//};
			//gen6.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringDWR gen6 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringDWR(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.spring.migrated", "org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringDWR", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen6.setGenerationID(generationID);
			gen6.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen6.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template7 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.spring.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/spring/migrated/files/springGWT.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringGWT gen7 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringGWT(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template7;
			//	}
			//};
			//gen7.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringGWT gen7 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringGWT(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.spring.migrated", "org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringGWT", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen7.setGenerationID(generationID);
			gen7.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen7.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template8 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.spring.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/spring/migrated/files/springHibernateHessian.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringHibernateHessian gen8 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringHibernateHessian(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template8;
			//	}
			//};
			//gen8.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringHibernateHessian gen8 = new org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringHibernateHessian(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.spring.migrated", "org.acceleo.module.pim.uml21.gen.java.spring.migrated.files.SpringHibernateHessian", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen8.setGenerationID(generationID);
			gen8.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen8.doGenerate(BasicMonitor.toMonitor(monitor));
			//final URI template9 = getTemplateURI("org.acceleo.module.pim.uml21.gen.java.struts.migrated", new Path("/org/acceleo/module/pim/uml21/gen/java/struts/migrated/files/main.emtl"));
			//org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Main gen9 = new org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Main(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template9;
			//	}
			//};
			//gen9.doGenerate(BasicMonitor.toMonitor(monitor));
			
			monitor.subTask("Loading...");
			org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Main gen9 = new org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Main(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.acceleo.module.pim.uml21.gen.java.struts.migrated", "org.acceleo.module.pim.uml21.gen.java.struts.migrated.files.Main", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen9.setGenerationID(generationID);
			gen9.addPropertiesFile(GenerateAll.PROPERTY_FILE_PATH);
			gen9.doGenerate(BasicMonitor.toMonitor(monitor));
		}
			
		
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
