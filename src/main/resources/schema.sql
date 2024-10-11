create table public.details (
    id integer primary key not null ,
    height integer,
    weight integer,
    eye_color character varying(15),
    hair_color character varying(15),
    nationality character varying(15),
    occupation character varying(15),
    description text
);

create table public.people (
                               id integer primary key not null,
                               name character varying(30),
                               surname character varying(30),
                               gender character varying(15),
                               birth_date date,
                               details_id integer,
                               foreign key (details_id) references public.details(id)
);

insert into public.details (id, height, weight, eye_color, hair_color, nationality, occupation, description) values (1, 170, 60, 'blue', 'blond', 'Ukrainian', 'developer', 'i work in IT');
insert into public.details (id, height, weight, eye_color, hair_color, nationality, occupation, description) values (2, 159, 42, 'green', 'ginger', 'Russian', 'qa', 'I work in IT, but i am not a developer');
insert into public.details (id, height, weight, eye_color, hair_color, nationality, occupation, description) values (3, 180, 90, 'gray', 'brown', 'Russian', 'manager', 'I can manage people in IT, but i am not a developer any more');
insert into public.details (id, height, weight, eye_color, hair_color, nationality, occupation, description) values (4, 160, 50, 'brown', 'black', 'Ukrainian', 'doctor', 'I am a doctor');
insert into public.details (id, height, weight, eye_color, hair_color, nationality, occupation, description) values (5, 165, 75, 'blue', 'brown', 'Russian', 'teacher', 'I am a teacher');

insert into public.people (id, name, surname, gender, birth_date, details_id) values (1, 'Pavel', 'Shevchenko', 'male', '1990-01-01', 1);
insert into public.people (id, name, surname, gender, birth_date, details_id) values (2, 'Irina', 'Ivanova', 'female', '1980-03-03', 2);
insert into public.people (id, name, surname, gender, birth_date, details_id) values (3, 'Maxim', 'Petrov', 'male', '1970-05-05', 3);
insert into public.people (id, name, surname, gender, birth_date, details_id) values (4, 'Ekaterina', 'Pavlenko', 'female', '1996-02-02', 4);
insert into public.people (id, name, surname, gender, birth_date, details_id) values (5, 'Valentina', 'Smirnova', 'female', '1970-08-08', 5);