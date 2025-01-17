/**
 * This code is generated using [[https://www.scala-sbt.org/contraband]].
 */

// DO NOT EDIT MANUALLY
package xsbti.api;
public abstract class ParameterizedDefinition extends xsbti.api.ClassDefinition implements java.io.Serializable {
    
    private TypeParameter[] typeParameters;
    protected ParameterizedDefinition(String _name, Access _access, Modifiers _modifiers, Annotation[] _annotations, TypeParameter[] _typeParameters) {
        super(_name, _access, _modifiers, _annotations);
        typeParameters = _typeParameters;
    }
    
    public TypeParameter[] typeParameters() {
        return this.typeParameters;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof ParameterizedDefinition)) {
            return false;
        } else {
            ParameterizedDefinition o = (ParameterizedDefinition)obj;
            return this.name().equals(o.name()) && this.access().equals(o.access()) && this.modifiers().equals(o.modifiers()) && java.util.Arrays.deepEquals(this.annotations(), o.annotations()) && java.util.Arrays.deepEquals(this.typeParameters(), o.typeParameters());
        }
    }
    public int hashCode() {
        return 37 * (37 * (37 * (37 * (37 * (37 * (17 + "xsbti.api.ParameterizedDefinition".hashCode()) + name().hashCode()) + access().hashCode()) + modifiers().hashCode()) + java.util.Arrays.deepHashCode(annotations())) + java.util.Arrays.deepHashCode(typeParameters()));
    }
    public String toString() {
        return "ParameterizedDefinition("  + "name: " + name() + ", " + "access: " + access() + ", " + "modifiers: " + modifiers() + ", " + "annotations: " + annotations() + ", " + "typeParameters: " + typeParameters() + ")";
    }
}
