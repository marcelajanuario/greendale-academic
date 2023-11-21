CREATE TABLE public.student (
	id uuid NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT student_pk PRIMARY KEY (id)
);

INSERT INTO public.student
(id, "name")
VALUES(gen_random_uuid(), 'Troy Barnes');