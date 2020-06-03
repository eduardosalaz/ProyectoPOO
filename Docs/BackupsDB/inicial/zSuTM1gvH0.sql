-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 03-06-2020 a las 00:46:08
-- Versión del servidor: 8.0.13-4
-- Versión de PHP: 7.2.24-0ubuntu0.18.04.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `zSuTM1gvH0`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Asiento`
--

CREATE TABLE `Asiento` (
  `ID_Asiento` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `tipo` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Boleto`
--

CREATE TABLE `Boleto` (
  `ID_Boleto` int(11) NOT NULL,
  `Tipo` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `Costo` smallint(5) NOT NULL,
  `ID_Funcion` int(11) NOT NULL,
  `ID_Asiento` varchar(5) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Corte Dulceria`
--

CREATE TABLE `Corte Dulceria` (
  `Fecha_Corte_Dulc` datetime NOT NULL,
  `ID_Usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Corte Taquilla`
--

CREATE TABLE `Corte Taquilla` (
  `Fecha_Corte` datetime NOT NULL,
  `ID_Usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Detalles Venta Boleto`
--

CREATE TABLE `Detalles Venta Boleto` (
  `ID_VentaBoleto` int(11) NOT NULL,
  `ID_Boleto` int(11) NOT NULL,
  `Tipo` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `Costo` smallint(5) NOT NULL,
  `Cantidad` smallint(5) NOT NULL,
  `Num_Sala` smallint(30) NOT NULL,
  `ID_Funcion` int(11) NOT NULL,
  `ID_Asiento` varchar(5) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Detalles Venta Dulceria`
--

CREATE TABLE `Detalles Venta Dulceria` (
  `ID_VentaDulceria` int(11) NOT NULL,
  `ID_Producto` int(11) NOT NULL,
  `Cantidad` smallint(5) NOT NULL,
  `Precio_Producto` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Funcion`
--

CREATE TABLE `Funcion` (
  `ID_Funcion` int(11) NOT NULL,
  `Num_Sala` smallint(30) NOT NULL,
  `ID_Peli` int(11) NOT NULL,
  `Fecha_Peli` date NOT NULL,
  `Hora_Peli` time NOT NULL,
  `Tipo` varchar(5) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pelicula`
--

CREATE TABLE `Pelicula` (
  `ID_Pelicula` int(11) NOT NULL,
  `Clasificacion` varchar(3) COLLATE utf8_unicode_ci NOT NULL,
  `Version` tinyint(1) NOT NULL,
  `Duracion` smallint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Producto Dulceria`
--

CREATE TABLE `Producto Dulceria` (
  `ID_Producto` int(11) NOT NULL,
  `Tipo_Producto` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `Tamaño` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `Precio` float NOT NULL,
  `Sabor` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `Existencias` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Producto Dulceria`
--

INSERT INTO `Producto Dulceria` (`ID_Producto`, `Tipo_Producto`, `Tamaño`, `Precio`, `Sabor`, `Existencias`) VALUES
(1, 'Coca Cola', 'chica', 60.5, 'Cola', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Sala`
--

CREATE TABLE `Sala` (
  `Num_Sala` smallint(30) NOT NULL,
  `Tipo` int(11) NOT NULL,
  `Cant_Asientos` smallint(250) NOT NULL,
  `Tipo_Asientos` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `Pelicula` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuario`
--

CREATE TABLE `Usuario` (
  `ID_Usuario` int(11) NOT NULL,
  `Admin` tinyint(1) NOT NULL,
  `Contrasena` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Telefono` smallint(12) NOT NULL,
  `Direccion` varchar(60) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Usuario`
--

INSERT INTO `Usuario` (`ID_Usuario`, `Admin`, `Contrasena`, `Nombre`, `Telefono`, `Direccion`) VALUES
(20, 1, 'holaaa', 'fyuyt', 980, 'uytfuytf'),
(1234, 0, 'pedro', 'juan', 4683, 'reghppiuohpiuyhp'),
(1865021, 1, '31', 'Rogelio', 123, 'San Pedro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Venta Boleto`
--

CREATE TABLE `Venta Boleto` (
  `ID_VentaBoleto` int(11) NOT NULL,
  `ID_Usuario` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Costo Total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Venta Dulceria`
--

CREATE TABLE `Venta Dulceria` (
  `ID_VentaDulceria` int(11) NOT NULL,
  `ID_Usuario` int(11) NOT NULL,
  `Fecha_VentaDulc` datetime NOT NULL,
  `Costo_Total_Dulc` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Boleto`
--
ALTER TABLE `Boleto`
  ADD PRIMARY KEY (`ID_Boleto`);

--
-- Indices de la tabla `Funcion`
--
ALTER TABLE `Funcion`
  ADD PRIMARY KEY (`ID_Funcion`);

--
-- Indices de la tabla `Pelicula`
--
ALTER TABLE `Pelicula`
  ADD PRIMARY KEY (`ID_Pelicula`);

--
-- Indices de la tabla `Producto Dulceria`
--
ALTER TABLE `Producto Dulceria`
  ADD PRIMARY KEY (`ID_Producto`);

--
-- Indices de la tabla `Sala`
--
ALTER TABLE `Sala`
  ADD UNIQUE KEY `Num_Sala` (`Num_Sala`);

--
-- Indices de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD UNIQUE KEY `ID_Usuario` (`ID_Usuario`);

--
-- Indices de la tabla `Venta Boleto`
--
ALTER TABLE `Venta Boleto`
  ADD PRIMARY KEY (`ID_VentaBoleto`);

--
-- Indices de la tabla `Venta Dulceria`
--
ALTER TABLE `Venta Dulceria`
  ADD PRIMARY KEY (`ID_VentaDulceria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Funcion`
--
ALTER TABLE `Funcion`
  MODIFY `ID_Funcion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  MODIFY `ID_Usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1865023;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
