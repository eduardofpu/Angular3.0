package org.wpattern.mutrack.simple.utils;

public final class ServicePath {

	///////////////////////////////////////////////////////////////
	// ROOT PATH
	///////////////////////////////////////////////////////////////

	public static final String ALL = "/**";
	public static final String ROOT_PATH = "/api";
	public static final String PUBLIC_ROOT_PATH = ROOT_PATH + "/public";
	public static final String PRIVATE_ROOT_PATH = ROOT_PATH + "/private";

	///////////////////////////////////////////////////////////////
	// PRIVATE PATHS
	///////////////////////////////////////////////////////////////

	public static final String PACKAGEE_PATH = PRIVATE_ROOT_PATH + "/packagee";
	public static final String PERMISSION_PATH = PRIVATE_ROOT_PATH + "/permission";
	public static final String PERVISIT_PATH = PUBLIC_ROOT_PATH + "/permisvisit";
	
	
	public static final String EDITUSER_PATH = PRIVATE_ROOT_PATH + "/edituser";
	public static final String USUARIOS_PATH = PRIVATE_ROOT_PATH + "/usuarios";
	public static final String VISITANTES_PATH = PUBLIC_ROOT_PATH + "/visitantes";
	
	
	public static final String JASPER_PATH = PRIVATE_ROOT_PATH + "/jasper";	
	public static final String JASPER_FORM_PATH = PRIVATE_ROOT_PATH + "/jasperform";	
	public static final String FILE_PATH = PRIVATE_ROOT_PATH + "/upload";
	public static final String FILE_PATH_MAP = PRIVATE_ROOT_PATH + "/uploadmap";	                             
	public static final String FORM_PATH = PRIVATE_ROOT_PATH + "/formulario";

	///////////////////////////////////////////////////////////////
	// PUBLIC PATHS
	///////////////////////////////////////////////////////////////

		
	public static final String LOGIN_PATH = PUBLIC_ROOT_PATH + "/login";
	public static final String LOGOUT_PATH = PUBLIC_ROOT_PATH + "/logout";

}
