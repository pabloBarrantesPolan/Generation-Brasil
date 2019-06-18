select count(*) from movies;
select count(id) from movies;
select * from movies where genre_id = 3;
select * from movies where rating >= 7 limit 10;
select avg(rating) from movies;

select sum(length) from movies where rating >= 9;

select @pior := min(rating) from movies;
select title from movies where rating = @pior;

select 