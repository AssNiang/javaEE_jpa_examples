package sn.ept.git.dic2.relationentity.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.relationentity.entities.Formation;
import sn.ept.git.dic2.relationentity.entities.carteEleve;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-06T16:15:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Eleve.class)
public class Eleve_ extends Personne_ {

    public static volatile SingularAttribute<Eleve, carteEleve> carte;
    public static volatile SingularAttribute<Eleve, Formation> formation;

}