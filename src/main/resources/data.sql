INSERT INTO product_type (type, base_quantity, base_unit) VALUES
    ('drágakövek', 1, 'karát'),
    ('tudományos alapanyagok', 1, 'kg vagy l'),
    ('fémek, építőanyagok', 1, 'kg'),
    ('ruhaanyagok', 1, 'méter / 150 cm széles'),
    ('élőállat', 1, 'db'),
    ('rabszolga', 1, 'db'),
    ('ételek', 1, 'kg / palack / napi takarmány'),
    ('szállás', 1, 'nap'),
    ('szórakozás', 1, 'alkalom'),
    ('szórakoztató eszköz', 1, 'adag'),
    ('utazás', 1, 'nap'),
    ('szépítkezési kellék', 1, 'db / alapméret'),
    ('szépítkezési szolgáltatás', 1, 'fő'),
    ('egészségügy', 1, 'fő'),
    ('bútor, lakásfelszerelés', 1, 'db / szett'),
    ('tudomány, technikai cucc', 1, 'db');


INSERT INTO precious_stones (name, min_value, min_coin, max_value, max_coin, material_category, type_id) VALUES
   ('achát', 4, 'SILVER', 4, 'SILVER', 'III', 1),
   ('akvamarin', 100, 'SILVER', 100, 'SILVER', 'III', 1),
   ('alexandrit', 40, 'SILVER', 40, 'SILVER', 'III', 1),
   ('gyémánt', 1000, 'GOLD', 1000, 'GOLD', 'III', 1);

INSERT INTO building_materials (name, min_value, min_coin, max_value, max_coin, material_category, type_id) VALUES
    ('fa', 0.1, 'COPPER', 1, 'SILVER', 'I', 3),
    ('üveg / kristály', 5, 'GOLD', 50, 'GOLD', 'IV', 3);

INSERT INTO scientific_materials (name, min_value, min_coin, max_value, max_coin, material_category, type_id) VALUES
    ('papír - A4', 30, 'COPPER', 300, 'COPPER', 'I', 2),
    ('tinta', 1, 'SILVER', 2, 'SILVER', 'I', 2);
