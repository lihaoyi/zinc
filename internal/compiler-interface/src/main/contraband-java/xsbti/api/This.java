/**
 * This code is generated using [[https://www.scala-sbt.org/contraband]].
 */

// DO NOT EDIT MANUALLY
package xsbti.api;
public final class This extends xsbti.api.PathComponent implements java.io.Serializable {
    
    public static This create() {
        return new This();
    }
    public static This of() {
        return new This();
    }
    
    protected This() {
        super();
        
    }
    
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof This)) {
            return false;
        } else {
            This o = (This)obj;
            return true;
        }
    }
    public int hashCode() {
        return 37 * (17 + "xsbti.api.This".hashCode());
    }
    public String toString() {
        return "This("  + ")";
    }
}
