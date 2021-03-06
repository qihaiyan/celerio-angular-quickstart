/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-angular:src/main/java/domain/EntityMeta_.java.e.vm
 */
package com.mycompany.myapp.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Author.class)
public abstract class Author_ {

    // Raw attributes
    public static volatile SingularAttribute<Author, Integer> id;
    public static volatile SingularAttribute<Author, Civility> civility;
    public static volatile SingularAttribute<Author, String> firstName;
    public static volatile SingularAttribute<Author, String> lastName;
    public static volatile SingularAttribute<Author, String> email;
    public static volatile SingularAttribute<Author, LocalDate> birthDate;
    public static volatile SingularAttribute<Author, LocalDateTime> birthDateTime;

    // Many to one
    public static volatile SingularAttribute<Author, Author> favoriteAuthor;

    // One to many
    public static volatile ListAttribute<Author, Book> books;
    public static volatile ListAttribute<Author, Project> projects;
}