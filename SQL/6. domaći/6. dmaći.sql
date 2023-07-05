-- Zadatak 1: Prikazati sve filmove koji se rade o zenama (malo za razmisliti)
-- koristim %woman % kako bih iz rezultata izbacio womanizer-a ako u tekstu ne postoji zena (woman, feminist, gilr, waitress)
SELECT title FROM film WHERE description ILIKE '%woman %' OR description ILIKE '%feminist%' OR description ILIKE '%girl%' OR description ILIKE '%waitress%'; 

-- Zadatak 2: Prikazati sve kupce koji imaju ID izmedju 200 i 300
SELECT first_name, last_name FROM customer WHERE customer_id BETWEEN 200 AND 300;

-- Zadatak 3: Koji prodavac (staff_id) je prodao vise filmova (tabela payment)?
SELECT staff_id FROM payment GROUP BY staff_id; -- proveravam koliko ID-ja postoji
SELECT COUNT(staff_id) FROM payment WHERE staff_id = 1; -- koliko je prvi prodao
SELECT COUNT(staff_id) FROM payment WHERE staff_id = 2; -- koliko je drugi prodao
-- RESENJE: Prodavac sa staff_id = 2 je prodao vise filmova

-- Zadatak 4: Da li je prodavac prodao vise filmova napravio veci profit od prodavca koji je prodao manje filmova?
SELECT staff_id FROM payment GROUP BY staff_id; -- proveravam koliko ID-ja postoji
SELECT COUNT(staff_id) FROM payment WHERE staff_id = 1; -- koliko je prvi prodao
SELECT COUNT(staff_id) FROM payment WHERE staff_id = 2; -- koliko je drugi prodao
SELECT SUM(amount) FROM payment WHERE staff_id = 1; -- profit koji je prvi napravio
SELECT SUM(amount) FROM payment WHERE staff_id = 2; -- profit koji je drugi napravio
-- RESENJE: Prodavac koji je prodao vise filmova je napravio veci profit (staff_id = 2)