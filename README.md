# SiriusPatternInstanceEditorExample
This is an example Eclipse editor implemented with EMF and Sirius.
The basic idea is to be able to create a pattern in the form of a (very simplified) class diagram and then instantiate elements from the pattern. One of the main challenges here is to preserve the (user-defined via point&click) layout of the pattern when instantiating (and deleting) objects.

This example is by no means complete or a good example of how such editor should be implemented. It is just a minimal example that demonstrates a lot of Sirius features.

## Metamodel
Create a new *Ecore Modeling Project* (man.em.nik.objinst.mm). You can then use either the *Entities* representation (Sirius Perspective active) to graphically work with the model or use the *Sample Ecore Model Editor* for a tree view of the metamodel.
Reload the *genmodel file and generate Model, Edit, and Editor code. Refer to EFM documentation for working with Ecore.

The metamodel is defined in Ecore as follows:
<img src="" />
The root element is Container0. Contains one or more Container01 objects.
Container01 has two containment references:
 - objects holds a list of Objects which (with their respective relations) is essentially the pattern
 - instances holds a list of Objects each of which references Objects from the "objects" list
Object is a class that represents the Nodes in our class diagram. Although the metamodel does not enforce it, Objects in the "objects" list  are part of the pattern and are considered to be an InstaceType (It can be instantiated) and must therefore not have an instanceType. It will, however have zero or more "children" (instances). Respectively, Objects in the "instances" list are instances of Objects in the "objects" list and must have (reference) an instanceType and have no children.
Relations are contained in Objects and represent the connections in our diagram. 
Although relations cannot be explicitely instantiated they are replicated when instantiating an object.

The behavior and restrictions described for the above metamodel are implemented in the Sirius editor.
Again, the metamodel is not best suited for the example but is simple enough to not distract from the implementation of the editor.

## Sirius

Create a new *Viewpoint Specification Project* (man.em.nik.objinst.design). 

### Overview of editor specification
We have two layers - one for the pattern diagram and one for the instance.
The pattern layer defines mappings or Container01, Object (pattern), and Relation
The Instance layer reuses mappings from pattern layer for Container01, Object (pattern), and Relation. Additionally define mappings for Object (instances) and realtions between instances as well as between instaces and pattern objects.

Mappings are rules that specify which semantic elements are displayed in the diagram and how.
The main idea behind reusing mappings is that the layout of the pattern is preserved. (We could instead, and that might be a better way of doing it, create and independent layer or even a diagram and copy the layout of the pattern layer into the instance layer. That, however, requires more work.)

<img src="" />

### pdiPattern

### pdiInstantiation

### Filters

### ModelChangeTrigger, Automatically activate a filter

### ModelChangeTrigger, Automatically deactivate a (conflicting) layer

### External Java Action

TODO: ...
