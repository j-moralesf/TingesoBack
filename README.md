PGDMP         0                 z           Entrega2    13.4    13.4 
    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    17489    Entrega2    DATABASE     f   CREATE DATABASE "Entrega2" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Chile.1252';
    DROP DATABASE "Entrega2";
                postgres    false            �            1259    17492    producto    TABLE     �   CREATE TABLE public.producto (
    id integer NOT NULL,
    nombre character varying(50),
    fechavencimiento date,
    categoria character varying(10),
    precio integer
);
    DROP TABLE public.producto;
       public         heap    postgres    false            �            1259    17490    producto_id_seq    SEQUENCE     �   CREATE SEQUENCE public.producto_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.producto_id_seq;
       public          postgres    false    201            �           0    0    producto_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.producto_id_seq OWNED BY public.producto.id;
          public          postgres    false    200            "           2604    17495    producto id    DEFAULT     j   ALTER TABLE ONLY public.producto ALTER COLUMN id SET DEFAULT nextval('public.producto_id_seq'::regclass);
 :   ALTER TABLE public.producto ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    200    201    201            �          0    17492    producto 
   TABLE DATA           S   COPY public.producto (id, nombre, fechavencimiento, categoria, precio) FROM stdin;
    public          postgres    false    201   �	       �           0    0    producto_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.producto_id_seq', 1, false);
          public          postgres    false    200            �      x������ � �     