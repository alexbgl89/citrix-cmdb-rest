-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;
INSERT INTO citrixcis(id, ci_info, ci_name, ci_platform, environment, software_version) values(1, 'Citrix VDA', 'usctxpwwrk1', 'Windows Server', 'PRODUCTION', '1:1:1');
INSERT INTO citrixcis(id, ci_info, ci_name, ci_platform, environment, software_version) values(2, 'Citrix VDA', 'usctxpwwrk2', 'Windows Server', 'PRODUCTION', '1:1:1');
INSERT INTO citrixcis(id, ci_info, ci_name, ci_platform, environment, software_version) values(3, 'Citrix VDA', 'usctxpwwrk3', 'Windows Server', 'PRODUCTION', '1:1:2');
INSERT INTO citrixcis(id, ci_info, ci_name, ci_platform, environment, software_version) values(4, 'Citrix ADM', 'usctxpwadm1', 'Windows Server', 'PRODUCTION', '2:1:1');