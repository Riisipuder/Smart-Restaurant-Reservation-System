insert into restaurant_tables (table_number, capacity, x_position, y_position, active) values
('T1', 2, 120, 100, true),
('T2', 2, 280, 100, true),
('T3', 4, 460, 100, true),
('T4', 4, 660, 100, true),
('T5', 2, 140, 260, true),
('T6', 4, 340, 260, true),
('T7', 4, 560, 260, true),
('T8', 6, 780, 260, true),
('T9', 2, 120, 460, true),
('T10', 4, 320, 460, true),
('T11', 6, 560, 460, true),
('T12', 8, 800, 460, true);

insert into restaurant_table_features (restaurant_table_id, table_feature_id)
select rt.id, tf.id
from restaurant_tables rt
join table_features tf on tf.code = 'WINDOW'
where rt.table_number in ('T1', 'T2', 'T3', 'T4');

insert into restaurant_table_features (restaurant_table_id, table_feature_id)
select rt.id, tf.id
from restaurant_tables rt
join table_features tf on tf.code = 'PRIVACY'
where rt.table_number in ('T3', 'T5', 'T9', 'T10');
