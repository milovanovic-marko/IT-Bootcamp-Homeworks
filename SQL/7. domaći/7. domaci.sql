-- Zadatak 5: Na kojoj adresi zivi zaposleni Jon Stephens
SELECT address FROM address WHERE address_id = (SELECT address_id FROM staff WHERE first_name = 'Jon' AND last_name = 'Stephens');

-- Zadatak 6: Pronaci filmove u kojima glumi Zero Cage
SELECT title FROM film WHERE film_id IN (SELECT film_id FROM film_actor WHERE actor_id IN (SELECT actor_id FROM actor WHERE first_name = 'Zero' AND last_name = 'Cage'));

-- Zadatak 7 (SAMO ZA VEZBU): Koje filmove je iznajmila Olga Jimenez
SELECT title FROM film WHERE film_id IN (SELECT film_id FROM inventory WHERE inventory_id IN (SELECT inventory_id FROM rental WHERE customer_id = (SELECT customer_id FROM customer WHERE first_name = 'Olga' AND last_name = 'Jimenez')));