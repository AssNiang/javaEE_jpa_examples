package sn.ept.git.dic2.relationentity.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.relationentity.entities.Eleve;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-06T16:15:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Formation.class)
public class Formation_ { 

    public static volatile SingularAttribute<Formation, String> code;
    public static volatile SingularAttribute<Formation, String> description;
    public static volatile SingularAttribute<Formation, String> nom;
    public static volatile ListAttribute<Formation, Eleve> eleves;

}