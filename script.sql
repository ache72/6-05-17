use Neptuno
go
select * from Proveedores

select pais from Proveedores

select ciudad from Proveedores
where Pais = 'Estados unidos'


----------------------------------------------------
----creando procedimientos almacenado
----listar paises

create procedure sp_lis_paises_ache
as
select distinct Pais from Proveedores

---------------------------------
----creando procedimiento almacenado
------listar cuidades

create procedure sp_lis_ciudad_ache  'francia'
@ciudad varchar(50)
as
select distinct ciudad from Proveedores 
where Pais=@ciudad

-- datos prueba : francia Annecy
create procedure sp_lis_paisporciudad_ache 'francia','Annecy'
@pais varchar(50),
@ciudad varchar(50)
as
select * from Proveedores 
where Pais=@pais and Ciudad =@ciudad
