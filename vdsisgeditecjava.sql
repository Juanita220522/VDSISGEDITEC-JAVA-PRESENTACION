-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 16-11-2024 a las 02:11:38
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10
CREATE DATABASE IF NOT EXISTS `vdsisgeditec` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `vdsisgeditec`;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vdsisgeditec`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_usuario` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `nombre_empresa` varchar(45) NOT NULL,
  `nombre_cliente` varchar(45) NOT NULL,
  `linea` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `numero_telefonico` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_usuario`, `id_cliente`, `nombre_empresa`, `nombre_cliente`, `linea`, `direccion`, `numero_telefonico`) VALUES
(1, 1, 'Postres JB', 'Juana Beru', 'Camaras Inteligentes', 'Diagonal 12 No-12.09 Bogota', '3214567412'),
(1, 30, 'Vivi SAS', 'Viviana Obando', 'Smartphones', 'Cll 14 No 14A-24 Cali', '3127201452'),
(1, 32, 'Naomy Products', 'Carlos Gamboa', 'Gadgets', 'Loca 32 CaliValle', '3214568523'),
(1, 33, 'Tecnology Universe', 'Fernando Obandp', 'Portatiles', 'Local 115 CC La Habana Bogota', '3145624563'),
(1, 34, 'Brian DS', 'Brian Cisneros', 'Varios', 'Independiente', '314523698'),
(14, 61, 'Alfaguara', 'Damian Serrato', 'PC Laptops', 'Cll 9 No. 22a-37', '3124597863'),
(1, 62, 'Milu Cambbels', 'Milu Castro', 'Accesorios', 'Dg 24a 105c', '3221452580'),
(14, 63, 'Lapiz Azuli', 'Carla Meneces', 'Varios', 'Local 15 Calle Prado', '3124789654'),
(15, 64, 'Curly Producciones', 'Carlos Camacho', 'Repuestos', 'Cll 26 No.22-05', '3124762584'),
(18, 67, 'Andamios Y Mas', 'Jeferson Cossio', 'Camaras', 'Diagonal 12 No. 12-09 Armenia', '3221234567');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id_usuario` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `numero_items` varchar(45) NOT NULL,
  `precio_total` varchar(45) NOT NULL,
  `telefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id_usuario`, `id_pedido`, `id_proveedor`, `id_producto`, `id_cliente`, `direccion`, `numero_items`, `precio_total`, `telefono`) VALUES
(1, 4, 1, 4, 32, 'Loca 32 CaliValle', '10', '890000.0', '3214568523'),
(14, 5, 2, 5, 33, 'Local 115 CC La Habana Bogota', '9', '1620000.0', '3145624563'),
(17, 6, 2, 1, 1, 'Diagonal 12 No-12.09 Bogota', '4', '10000000', '3214567412'),
(17, 7, 1, 4, 30, 'Cll 14 No 14A-24 Cali', '20', '1780000.0', '3127201452'),
(17, 8, 5, 6, 34, 'Independiente', '3', '750000.0', '314523698');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_usuario` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `nombre_producto` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `precio_unidad` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_usuario`, `id_producto`, `id_proveedor`, `nombre_producto`, `marca`, `precio_unidad`) VALUES
(1, 1, 1, 'Portatil Acer Aspire 53-G', 'Acer', '2500000.0'),
(14, 2, 2, 'Pantallas Genericas', 'Varios Telefonos', '100000.0'),
(16, 3, 3, 'Pasta Termica', 'MX-4', '28500.0'),
(16, 4, 1, 'Ram 4Gb Samsumg DDR5', 'Samsumg', '89000.0'),
(1, 5, 2, 'Carcasa Portatiles ', 'Acer', '180000.0'),
(16, 6, 5, 'Camaras Wifi', 'Lenovo', '250000.0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `id_usuario` int(11) NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `nombre_proveedor` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`id_usuario`, `id_proveedor`, `nombre_proveedor`, `telefono`) VALUES
(1, 1, 'Juan Rodriguez', '3001452360'),
(14, 2, 'Jose Obando', '3214569632'),
(14, 3, 'Maria Antionietas', '3147895415'),
(14, 5, 'Carmelo Camacho', '32232341234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `tipo_usuario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nombre_usuario`, `password`, `tipo_usuario`) VALUES
(1, 'admin', 'admin', 'administrador'),
(14, 'david', '1234', 'administrador'),
(15, 'nicolascastro', '1410089', 'cliente'),
(16, 'olgaobando', '220522', 'proveedor'),
(17, 'mariberu', '3333', 'cliente'),
(18, 'edison', '1313', 'administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `fk_clientes_usuario` (`id_usuario`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_usuario_idx` (`id_usuario`),
  ADD KEY `id_producto_idx` (`id_producto`),
  ADD KEY `id_proveedor_idx` (`id_proveedor`),
  ADD KEY `id_cliente_idx` (`id_cliente`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_usuario_idx` (`id_usuario`),
  ADD KEY `id_proveedor_idx` (`id_proveedor`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`id_proveedor`),
  ADD KEY `id_usuario_idx` (`id_usuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `id_usuario_UNIQUE` (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `fk_clientes_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `fk_pedidos_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  ADD CONSTRAINT `fk_pedidos_producto` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id_producto`),
  ADD CONSTRAINT `fk_pedidos_proveedor` FOREIGN KEY (`id_proveedor`) REFERENCES `productos` (`id_proveedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_pedidos_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `fk_productos_proveedor` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id_proveedor`),
  ADD CONSTRAINT `fk_productos_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD CONSTRAINT `fk_proveedores_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
