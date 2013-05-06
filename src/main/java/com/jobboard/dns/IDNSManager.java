package com.jobboard.dns;

/**
 * @author Chris Magers
 * Interface for DNS management.  This can be the interface from which all functionality is derived
 * for different vendors
 * 
 */

public interface IDNSManager {
	/**
	 * This is called by the main method and creates the domains
	 */
	public abstract boolean createDomain(String serverType, String company, String publicIP, String privateIP) throws Exception;
	
	/**
	 * This is called by the main method and deletes the domains
	 */
	public abstract boolean deleteDomain(String serverType, String company)throws Exception;
	
	/**
	 * This is called by the main method and gets all the domains
	 */
	public abstract String getDomains() throws Exception;
	
	/**
	 * This is called by the main method and removes the A records
	 */
	public abstract boolean deleteARecords(String serverType, String company, String publicIP) throws Exception;
	
	/**
	 * 
	 * @param orgID
	 * @return true if the domain creation is successful, false otherwise
	 */
	boolean createORGDomain(String orgID);
	
	/**
	 * This will create a board domain
	 * @param orgID
	 * @param boardName
	 * @return board URL if the domain creation is successful, null otherwise
	 */
	String createBoardDomain(String orgID, String boardName);
	
}