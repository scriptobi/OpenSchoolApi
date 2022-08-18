create table teachers (
  teacher_id int(11) not null auto_increment,
  firstname varchar(25) not null,
  lastname varchar(25) not null,
  constraint pk_teacher primary key (teacher_id)
) engine = innodb;

create table courses (
    course_id int(11) not null auto_increment,
    course_name varchar(25) not null,
    constraint pk_course primary key (course_id)
) engine = innodb;

create table students (
    student_id int(11) not null auto_increment,
    firstname varchar(25) not null,
    lastname varchar(25) not null,
    constraint pk_student primary key (student_id)
) engine = innodb;

create table sessions (
    session_id int(11) not null auto_increment,
    session_name varchar(25) not null,
    constraint pk_session primary key (session_id)
) engine = innodb;

create table students4sessions (
    session_fk int(11) not null,
    student_fk int(11) not null,
    constraint pk_student4session primary key (session_fk, student_fk),
    constraint fk_session_4_s4s foreign key (session_fk) references sessions(session_id),
    constraint fk_student_4_s4s foreign key (student_fk) references students(student_id),
    constraint uk_student4session unique (session_fk, student_fk)
) engine = innodb;

create table courses4teachers (
    c4t_id int(11) not null auto_increment,
    course_fk int(11) not null,
    teacher_fk int(11) not null,
    constraint pk_course4teacher primary key (c4t_id, course_fk, teacher_fk),
    constraint fk_course_4_c4t foreign key (course_fk) references courses(course_id),
    constraint fk_teacher_4_c4t foreign key (teacher_fk) references teachers(teacher_id),
    constraint uk_course4teacher unique (course_fk, teacher_fk)
) engine = innodb;

INSERT INTO teachers (firstname, lastname) VALUES
    ('Gérard', 'Mensoaf'),
    ('Nicole', 'Niclou'),
    ('Agathe', 'Zeblouse'),
    ('Helène', 'Nanfan')
;
INSERT INTO courses (course_name) VALUES
    ('Web design'),
    ('Python'),
    ('Angula Js'),
    ('Java Spring Boot'),
    ('SQL')
;
INSERT INTO courses4teachers (course_fk, teacher_fk) VALUES
    (1, 2),
    (1, 4),
    (2, 2),
    (3, 3),
    (4, 1),
    (5, 1)
;
INSERT INTO students (firstname, lastname) VALUES
    ('Violette', 'Evergarden'),
    ('Nagisa', 'Shioto'),
    ('Bell', 'Cranel'),
    ('Limule', 'Tempest'),
;
INSERT INTO sessions (session_name) VALUES
    ('EPSI 20-21'),
    ('LDS 20-21'),
    ('EPSI 21-22'),
    ('LSD 21-22')
;
INSERT INTO students4sessions (student_fk, session_fk) VALUES
    (1, 1),
    (2, 1),
    (3, 2),
    (1, 3),
    (2, 3),
    (4, 4)
;
