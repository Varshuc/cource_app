package com.cource_management_app.cource_app.entities;

        import jakarta.persistence.Entity;
        import jakarta.persistence.Id;
        import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

class Course
{

    @Id
    private long id;
    private String title;
    private String description;

}