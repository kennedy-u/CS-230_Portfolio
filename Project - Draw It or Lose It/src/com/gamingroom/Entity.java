package com.gamingroom; 

/**
 * A simple class with id and name for use in classes
 *
 * @author kennedy.uzoho@snhu.edu
 *
 */

public class Entity {
	private long id; 
	private String name;
	
	/**
     * Hide the default constructor to prevent creating empty instances.
     */
	private Entity() {	
	}
	
	/**
	 * Custom constructor with id & name params
	 * 
	 * @param id
	 * @param name
	 */
	public Entity(long id, String name) {
		this(); 
		this.id = id;
		this.name = name;
		}
	
	 /**
     * Returns the id
     *
     * @return the id
     */
	public long getId() {
		return id;
		}
	
	/**
     * Returns the name
     *
     * @return the name
     */
	public String getName() {
		return name;
		}
	
	/**
     * Returns the name
     *
     * @return the name
     */
	@Override
	public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
        }
	}
	









