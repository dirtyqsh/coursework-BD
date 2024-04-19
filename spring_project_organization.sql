-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 19, 2024 at 02:05 PM
-- Server version: 5.7.24
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `spring_project_organization`
--

-- --------------------------------------------------------

--
-- Table structure for table `договор`
--

CREATE TABLE `договор` (
  `код_договора` int(11) NOT NULL,
  `дата_подписания` datetime(6) DEFAULT NULL,
  `код_клиента` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `договор`
--

INSERT INTO `договор` (`код_договора`, `дата_подписания`, `код_клиента`) VALUES
(1, '2022-06-28 00:00:00.000000', 1),
(2, '2022-08-15 00:00:00.000000', 1),
(3, '2022-02-02 00:00:00.000000', 2),
(4, '2022-01-15 00:00:00.000000', 3),
(5, '2022-11-21 00:00:00.000000', 4),
(6, '2022-05-25 00:00:00.000000', 5);

-- --------------------------------------------------------

--
-- Table structure for table `клиент`
--

CREATE TABLE `клиент` (
  `код_клиента` int(11) NOT NULL,
  `адрес` varchar(255) DEFAULT NULL,
  `страна` varchar(255) DEFAULT NULL,
  `заказчик` varchar(255) DEFAULT NULL,
  `телефон` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `клиент`
--

INSERT INTO `клиент` (`код_клиента`, `адрес`, `страна`, `заказчик`, `телефон`) VALUES
(1, 'г. Томск, ул. Ленина, д. 52', 'Россия', 'Rubius', '+7(913)5521515'),
(2, 'г. Красноярск, ул. Маяковского, д. 70', 'Россия', 'Ростелеком', '+7(800)1202020'),
(3, 'г. Стокгольм, ул. Верх-стрит, д. 2', 'Швеция', 'ITea', '+2(123)8975641'),
(4, 'г. Шанхай, ул. Трилик, д. 201', 'Китай', 'Lyciaomei', '+9(010)1322010'),
(5, 'г. Тбилиси, ул. Нижневартовская, д. 3', 'Азербайджан', 'AzerComputer', '+7(567)4672098');

-- --------------------------------------------------------

--
-- Table structure for table `оборудование`
--

CREATE TABLE `оборудование` (
  `код_оборудования` int(11) NOT NULL,
  `наименование` varchar(255) DEFAULT NULL,
  `код_отдела` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `оборудование`
--

INSERT INTO `оборудование` (`код_оборудования`, `наименование`, `код_отдела`) VALUES
(1, 'Ноутбук Acer', 1),
(2, 'Ноутбук Lenovo', 1),
(3, 'Ноутбук Lenovo', 1),
(4, 'Ноутбук Lenovo', 1),
(5, 'Ноутбук Acer', 1),
(6, 'Ноутбук Acer', 1),
(7, 'Ноутбук Acer', 1),
(8, 'Ноутбук Acer', 1),
(9, 'Ноутбук Acer', 2),
(10, 'Стационарный компьютер', 2),
(11, 'Ноутбук Lenovo', 3),
(12, 'Графический планшет', 3),
(13, 'Графический планшет', 3),
(14, 'Ноутбук Acer', 4),
(15, 'Ноутбук Acer', 4);

-- --------------------------------------------------------

--
-- Table structure for table `оборудование_на_проекте`
--

CREATE TABLE `оборудование_на_проекте` (
  `код_оборудования` int(11) NOT NULL,
  `код_проекта` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `оборудование_на_проекте`
--

INSERT INTO `оборудование_на_проекте` (`код_оборудования`, `код_проекта`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(9, 1),
(10, 1),
(14, 1),
(1, 2),
(3, 2),
(4, 2),
(5, 2),
(6, 2),
(9, 2),
(10, 2),
(12, 2),
(15, 2),
(5, 3),
(6, 3),
(7, 3),
(8, 3),
(10, 3),
(11, 3),
(12, 3),
(14, 3),
(1, 4),
(2, 4),
(3, 4),
(9, 4),
(11, 4),
(12, 4),
(15, 4),
(2, 5),
(3, 5),
(4, 5),
(5, 5),
(9, 5),
(10, 5),
(11, 5),
(12, 5),
(15, 5),
(5, 6),
(6, 6),
(7, 6),
(11, 6),
(14, 6),
(1, 7),
(2, 7),
(3, 7),
(4, 7),
(5, 7),
(9, 7),
(11, 7),
(12, 7),
(14, 7);

-- --------------------------------------------------------

--
-- Table structure for table `отдел`
--

CREATE TABLE `отдел` (
  `код_отдела` int(11) NOT NULL,
  `начальник` int(11) DEFAULT NULL,
  `наименование` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `отдел`
--

INSERT INTO `отдел` (`код_отдела`, `начальник`, `наименование`) VALUES
(1, 1, 'Разработка'),
(2, 2, 'Техническая поддержка'),
(3, 3, 'Маркетинг'),
(4, 4, 'Управление качеством');

-- --------------------------------------------------------

--
-- Table structure for table `проект`
--

CREATE TABLE `проект` (
  `код_проекта` int(11) NOT NULL,
  `стоимость` float DEFAULT NULL,
  `дата_начала` datetime(6) DEFAULT NULL,
  `дата_окончания` datetime(6) DEFAULT NULL,
  `руководитель` int(11) DEFAULT NULL,
  `код_договора` int(11) DEFAULT NULL,
  `название` varchar(255) DEFAULT NULL,
  `статус` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `проект`
--

INSERT INTO `проект` (`код_проекта`, `стоимость`, `дата_начала`, `дата_окончания`, `руководитель`, `код_договора`, `название`, `статус`) VALUES
(1, 567650, '2022-06-30 22:00:00.000000', '2022-08-20 22:00:00.000000', 1, 1, 'Доработка системы подтверждения транзакций', b'1'),
(2, 25100000, '2022-08-20 22:00:00.000000', '2024-02-10 17:28:08.000000', 5, 2, 'Разработка системы мониторинга сотрудников с использованием нейросетевых моделей', b'0'),
(3, 1500000, '2022-02-15 00:00:00.000000', '2022-09-15 00:00:00.000000', 5, 3, 'Система оформления заказов', b'1'),
(4, 106576, '2022-03-20 00:00:00.000000', '2022-04-25 00:00:00.000000', 5, 3, 'Лендинг сайта', b'1'),
(5, 15567800, '2022-01-15 00:00:00.000000', '2023-08-23 00:00:00.000000', 1, 4, 'Система распознавания лиц', b'1'),
(6, 40000, '2022-11-21 00:00:00.000000', '2022-12-15 00:00:00.000000', 6, 5, 'Исправление системы авторизации пользователей', b'1'),
(7, 7500000, '2022-05-25 00:00:00.000000', '2023-12-15 00:00:00.000000', 1, 6, 'ПО для системы контроля качества вина', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `работа_сотрудника`
--

CREATE TABLE `работа_сотрудника` (
  `код_работы` int(11) NOT NULL,
  `стоимость` float DEFAULT NULL,
  `дата_начала` datetime(6) DEFAULT NULL,
  `дата_окончания` datetime(6) DEFAULT NULL,
  `код_сотрудника` int(11) DEFAULT NULL,
  `код_проекта` int(11) DEFAULT NULL,
  `статус` bit(1) DEFAULT NULL,
  `название` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `работа_сотрудника`
--

INSERT INTO `работа_сотрудника` (`код_работы`, `стоимость`, `дата_начала`, `дата_окончания`, `код_сотрудника`, `код_проекта`, `статус`, `название`) VALUES
(1, 30000, '2022-06-30 00:00:00.000000', '2022-07-15 00:00:00.000000', 1, 1, b'1', 'Проектирование системы'),
(2, 150000, '2022-06-30 00:00:00.000000', '2022-08-20 00:00:00.000000', 4, 1, b'1', 'Контроль качества исполнения'),
(3, 40000, '2022-07-15 00:00:00.000000', '2022-08-10 00:00:00.000000', 6, 1, b'1', 'Написание кода'),
(4, 30000, '2022-07-01 00:00:00.000000', '2022-07-30 00:00:00.000000', 7, 1, b'1', 'Написание кода'),
(5, 15000, '2022-08-01 00:00:00.000000', '2022-08-20 00:00:00.000000', 8, 1, b'1', 'Написание кода'),
(6, 7000, '2022-08-15 00:00:00.000000', '2022-08-20 00:00:00.000000', 9, 1, b'1', 'Настройка системы'),
(7, 3000, '2022-08-19 00:00:00.000000', '2022-08-20 00:00:00.000000', 10, 1, b'1', 'Презентация результата работы заказчику'),
(8, 700000, '2022-08-20 00:00:00.000000', '2022-11-28 00:00:00.000000', 1, 2, b'1', 'Проектирование системы'),
(9, 300000, '2023-10-20 00:00:00.000000', '2024-01-20 00:00:00.000000', 2, 2, b'0', 'Поддержка системы'),
(10, 150000, '2022-09-01 00:00:00.000000', '2022-12-01 00:00:00.000000', 3, 2, b'1', 'Переговоры с заказчиком'),
(11, 120000, '2024-01-15 00:00:00.000000', '2024-02-05 00:00:00.000000', 4, 2, b'0', 'Контроль качества'),
(12, 4000000, '2022-08-25 00:00:00.000000', '2024-01-15 00:00:00.000000', 5, 2, b'0', 'Написание кода и внедрение системы'),
(13, 1500000, '2022-09-01 00:00:00.000000', '2023-11-14 00:00:00.000000', 6, 2, b'1', 'Написание кода'),
(14, 2500000, '2022-08-21 00:00:00.000000', '2023-12-28 00:00:00.000000', 7, 2, b'1', 'Написание кода'),
(15, 550000, '2023-12-15 00:00:00.000000', '2024-02-01 00:00:00.000000', 8, 2, b'0', 'Исправление ошибок в коде'),
(16, 40000, '2022-02-01 00:00:00.000000', '2022-02-10 00:00:00.000000', 9, 2, b'0', 'Финальный контроль системы'),
(17, 367000, '2022-02-20 00:00:00.000000', '2022-05-18 00:00:00.000000', 2, 3, b'1', 'Техническая поддержка'),
(18, 20000, '2022-09-13 00:00:00.000000', '2022-09-15 00:00:00.000000', 3, 3, b'1', 'Презентация продукта заказчику'),
(19, 400000, '2022-02-15 00:00:00.000000', '2022-08-10 00:00:00.000000', 5, 3, b'1', 'Написание кода'),
(20, 210000, '2022-06-05 00:00:00.000000', '2022-08-10 00:00:00.000000', 6, 3, b'1', 'Написание кода'),
(21, 300000, '2022-03-14 00:00:00.000000', '2022-07-20 00:00:00.000000', 7, 3, b'1', 'Написание кода'),
(22, 120000, '2022-07-01 00:00:00.000000', '2022-08-20 00:00:00.000000', 8, 3, b'1', 'Написание кода'),
(23, 400000, '2022-03-01 00:00:00.000000', '2022-09-15 00:00:00.000000', 11, 3, b'1', 'Контроль качества работы'),
(24, 30000, '2022-03-20 00:00:00.000000', '2022-04-25 00:00:00.000000', 4, 4, b'1', 'Контроль качества'),
(25, 40000, '2022-03-20 00:00:00.000000', '2022-04-15 00:00:00.000000', 5, 4, b'1', 'Написание кода'),
(26, 10000, '2022-03-25 00:00:00.000000', '2022-04-10 00:00:00.000000', 6, 5, b'1', 'Написание кода'),
(27, 20000, '2022-04-01 00:00:00.000000', '2022-04-20 00:00:00.000000', 7, 4, b'1', 'Написание кода'),
(28, 7000, '2022-04-15 00:00:00.000000', '2022-04-25 00:00:00.000000', 9, 4, b'1', 'Настройка системы'),
(29, 4000, '2022-04-24 00:00:00.000000', '2022-04-25 00:00:00.000000', 10, 4, b'1', 'Презентация результата работы заказчику'),
(30, 1300000, '2022-01-20 00:00:00.000000', '2022-05-26 00:00:00.000000', 1, 5, b'1', 'Проектирование системы'),
(31, 300000, '2023-08-01 00:00:00.000000', '2023-08-23 00:00:00.000000', 2, 5, b'1', 'Внедрение системы'),
(32, 340000, '2022-08-15 00:00:00.000000', '2022-10-20 00:00:00.000000', 3, 5, b'1', 'Подготовка презентации для промежуточного отчета'),
(33, 2000000, '2022-05-01 00:00:00.000000', '2023-08-15 00:00:00.000000', 4, 5, b'1', 'Контроль качества'),
(34, 2400000, '2022-01-21 00:00:00.000000', '2023-05-20 00:00:00.000000', 6, 5, b'1', 'Написание кода'),
(35, 3150000, '2022-01-15 00:00:00.000000', '2023-07-27 00:00:00.000000', 7, 5, b'1', 'Написание кода'),
(36, 451000, '2023-01-16 00:00:00.000000', '2023-05-11 00:00:00.000000', 8, 5, b'1', 'Написание кода'),
(37, 150000, '2022-01-15 00:00:00.000000', '2022-02-20 00:00:00.000000', 9, 5, b'1', 'Исправление ошибок среды разработки'),
(38, 30000, '2023-08-22 00:00:00.000000', '2023-08-23 00:00:00.000000', 10, 5, b'1', 'Презентация готового продукта'),
(39, 15000, '2022-11-21 00:00:00.000000', '2022-12-10 00:00:00.000000', 6, 6, b'1', 'Написание кода'),
(40, 3500, '2022-11-30 00:00:00.000000', '2022-12-05 00:00:00.000000', 7, 6, b'1', 'Написание кода'),
(41, 18000, '2022-11-25 00:00:00.000000', '2023-12-12 00:00:00.000000', 8, 6, b'1', 'Написание кода'),
(42, 3000, '2022-12-14 00:00:00.000000', '2022-12-15 00:00:00.000000', 10, 6, b'1', 'Презентация готовой работы'),
(43, 8000, '2022-12-01 00:00:00.000000', '2022-12-05 00:00:00.000000', 11, 6, b'1', 'Проверка работоспособности системы'),
(44, 950000, '2022-05-30 00:00:00.000000', '2022-08-26 00:00:00.000000', 1, 7, b'1', 'Разработка архитектуры ПО'),
(45, 130000, '2023-12-01 00:00:00.000000', '2023-12-15 00:00:00.000000', 2, 7, b'1', 'Внедрение системы'),
(46, 300000, '2022-05-25 00:00:00.000000', '2022-07-13 00:00:00.000000', 3, 7, b'1', 'Дизайн системы'),
(47, 2600000, '2022-05-25 00:00:00.000000', '2023-12-15 00:00:00.000000', 4, 7, b'1', 'Контроль качества выполнения работ'),
(48, 2640000, '2022-05-25 00:00:00.000000', '2023-10-14 00:00:00.000000', 5, 7, b'1', 'Написание кода'),
(49, 670000, '2022-05-30 00:00:00.000000', '2022-12-10 00:00:00.000000', 6, 7, b'1', 'Написание кода'),
(50, 1850000, '2022-06-13 00:00:00.000000', '2023-12-01 00:00:00.000000', 7, 7, b'1', 'Написание кода'),
(51, 950000, '2023-01-14 00:00:00.000000', '2023-09-27 00:00:00.000000', 8, 7, b'1', 'Написание кода');

-- --------------------------------------------------------

--
-- Table structure for table `работа_субподрядчика`
--

CREATE TABLE `работа_субподрядчика` (
  `код_проекта` int(11) NOT NULL,
  `код_субподрядчика` int(11) NOT NULL,
  `код_работы` int(11) NOT NULL,
  `стоимость` float DEFAULT NULL,
  `дата_начала` datetime(6) DEFAULT NULL,
  `дата_окончания` datetime(6) DEFAULT NULL,
  `статус` bit(1) DEFAULT NULL,
  `название` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `работа_субподрядчика`
--

INSERT INTO `работа_субподрядчика` (`код_проекта`, `код_субподрядчика`, `код_работы`, `стоимость`, `дата_начала`, `дата_окончания`, `статус`, `название`) VALUES
(2, 1, 1, 1000510, '2022-12-01 00:00:00.000000', '2023-05-20 00:00:00.000000', b'1', 'Написание методов'),
(5, 2, 2, 901023, '2022-02-20 00:00:00.000000', '2022-06-07 00:00:00.000000', b'1', 'Написание кода'),
(7, 2, 3, 600000, '2022-05-28 00:00:00.000000', '2022-07-30 00:00:00.000000', b'1', 'Написание кода');

-- --------------------------------------------------------

--
-- Table structure for table `сотрудники`
--

CREATE TABLE `сотрудники` (
  `код_сотрудника` int(11) NOT NULL,
  `адрес` varchar(255) DEFAULT NULL,
  `дата_рождения` datetime(6) DEFAULT NULL,
  `фио` varchar(255) DEFAULT NULL,
  `код_отдела` int(11) DEFAULT NULL,
  `номер_телефона` varchar(255) DEFAULT NULL,
  `должность` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `сотрудники`
--

INSERT INTO `сотрудники` (`код_сотрудника`, `адрес`, `дата_рождения`, `фио`, `код_отдела`, `номер_телефона`, `должность`) VALUES
(1, 'ул. Ленина, д. 5, кв. 192', '1998-01-03 00:00:00.000000', 'Олейников М.Д.', 1, '+7(913)5891341', 'Старший системный архитектор'),
(2, 'ул. Советская, д. 10, кв. 45', '1990-05-15 00:00:00.000000', 'Иванов А.Н.', 2, '+7(912)3456789', 'Специалист по технической поддержке'),
(3, 'ул. Жукова, д. 8, кв. 55', '1988-07-18 00:00:00.000000', 'Кузнецова О.В.', 3, '+7(915)8765432', 'Менеджер по продажам'),
(4, 'ул. Герцена, д. 14, кв. 17', '1989-08-14 00:00:00.000000', 'Степанова Е.А.', 4, '+7(919)3456789', 'Менеджер по управлению качеством'),
(5, 'ул. Герцена, д. 15, кв. 23', '2001-09-11 00:00:00.000000', 'Антонов К.В.', 1, '+7(911)3216139', 'Старший разработчик'),
(6, 'ул. Пушкина, д. 10, кв. 15', '1985-03-20 00:00:00.000000', 'Иванов А.В.', 1, '+7(911)9876543', 'Разработчик'),
(7, 'пр. Ленина, д. 25, кв. 7', '1990-06-15 00:00:00.000000', 'Смирнова А.А.', 1, '+7(915)8765432', 'Разработчик'),
(8, 'ул. Гагарина, д. 5, кв. 12', '1988-09-03 00:00:00.000000', 'Петров П.А.', 1, '+7(910)1234567', 'Разработчик'),
(9, 'пр. Кирова, д. 18, кв. 3', '1992-11-08 00:00:00.000000', 'Кузнецов А.А.', 2, '+7(919)2345678', 'Специалист по технической поддержке'),
(10, 'пр. Маяковского, д. 8, кв. 30', '1993-06-25 00:00:00.000000', 'Михайлов Д.В.', 3, '+7(916)2345678', 'Менеджер по продажам'),
(11, 'ул. Кирова, д. 14, кв. 8', '1982-03-12 00:00:00.000000', 'Белов Д.С.', 4, '+7(911)1234567', 'Менеджер по управлению качеством');

-- --------------------------------------------------------

--
-- Table structure for table `сотрудники_на_проекте`
--

CREATE TABLE `сотрудники_на_проекте` (
  `код_проекта` int(11) NOT NULL,
  `код_сотрудника` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `сотрудники_на_проекте`
--

INSERT INTO `сотрудники_на_проекте` (`код_проекта`, `код_сотрудника`) VALUES
(1, 1),
(1, 4),
(1, 6),
(1, 7),
(1, 8),
(1, 9),
(1, 10),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 6),
(2, 7),
(2, 8),
(2, 9),
(3, 2),
(3, 3),
(3, 5),
(3, 6),
(3, 7),
(3, 8),
(3, 11),
(4, 4),
(4, 5),
(4, 6),
(4, 7),
(4, 9),
(4, 10),
(5, 1),
(5, 2),
(5, 3),
(5, 4),
(5, 6),
(5, 7),
(5, 8),
(5, 9),
(5, 10),
(6, 6),
(6, 7),
(6, 8),
(6, 10),
(6, 11),
(7, 1),
(7, 2),
(7, 3),
(7, 4),
(7, 5),
(7, 6),
(7, 7),
(7, 8);

-- --------------------------------------------------------

--
-- Table structure for table `субподрядчик`
--

CREATE TABLE `субподрядчик` (
  `код_субподрядчика` int(11) NOT NULL,
  `адрес` varchar(255) DEFAULT NULL,
  `страна` varchar(255) DEFAULT NULL,
  `исполнитель` varchar(255) DEFAULT NULL,
  `телефон` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `субподрядчик`
--

INSERT INTO `субподрядчик` (`код_субподрядчика`, `адрес`, `страна`, `исполнитель`, `телефон`) VALUES
(1, 'г. Омск, ул. Ленина, д. 52', 'Россия', 'ITeeshka', '+7(910)9854543'),
(2, 'г. Красногорск, ул. Маяковского, д. 23', 'Россия', 'DepoComp', '+7(999)9991199');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `договор`
--
ALTER TABLE `договор`
  ADD PRIMARY KEY (`код_договора`),
  ADD KEY `FKotirdf0alm12mvc96cx9hk8v1` (`код_клиента`);

--
-- Indexes for table `клиент`
--
ALTER TABLE `клиент`
  ADD PRIMARY KEY (`код_клиента`);

--
-- Indexes for table `оборудование`
--
ALTER TABLE `оборудование`
  ADD PRIMARY KEY (`код_оборудования`),
  ADD KEY `FKaxs5n3xnrexr7wa9kv6eubm0b` (`код_отдела`);

--
-- Indexes for table `оборудование_на_проекте`
--
ALTER TABLE `оборудование_на_проекте`
  ADD PRIMARY KEY (`код_оборудования`,`код_проекта`),
  ADD KEY `FKjgs3qwy3gb4ucys2e0h3fsjnv` (`код_проекта`);

--
-- Indexes for table `отдел`
--
ALTER TABLE `отдел`
  ADD PRIMARY KEY (`код_отдела`);

--
-- Indexes for table `проект`
--
ALTER TABLE `проект`
  ADD PRIMARY KEY (`код_проекта`),
  ADD KEY `FKgpengrom9snsbj1ikvh6kaffa` (`код_договора`),
  ADD KEY `FK8melgt16pd91qy5vrls2xbi1p` (`руководитель`);

--
-- Indexes for table `работа_сотрудника`
--
ALTER TABLE `работа_сотрудника`
  ADD PRIMARY KEY (`код_работы`),
  ADD KEY `FK55vr7v9hq00138wn0ohfqaubc` (`код_сотрудника`),
  ADD KEY `FKrrdy4m6q3vyprj9selapphqwr` (`код_проекта`);

--
-- Indexes for table `работа_субподрядчика`
--
ALTER TABLE `работа_субподрядчика`
  ADD PRIMARY KEY (`код_проекта`,`код_субподрядчика`,`код_работы`),
  ADD KEY `FKp9gm4wdn5rcxa4lex8p50cppf` (`код_субподрядчика`);

--
-- Indexes for table `сотрудники`
--
ALTER TABLE `сотрудники`
  ADD PRIMARY KEY (`код_сотрудника`),
  ADD KEY `FKhgey0llr48nox9u1lx5i4lk3h` (`код_отдела`);

--
-- Indexes for table `сотрудники_на_проекте`
--
ALTER TABLE `сотрудники_на_проекте`
  ADD PRIMARY KEY (`код_сотрудника`,`код_проекта`),
  ADD KEY `FKq0b24b1udjjybtmlshc7uv997` (`код_проекта`);

--
-- Indexes for table `субподрядчик`
--
ALTER TABLE `субподрядчик`
  ADD PRIMARY KEY (`код_субподрядчика`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `договор`
--
ALTER TABLE `договор`
  MODIFY `код_договора` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `клиент`
--
ALTER TABLE `клиент`
  MODIFY `код_клиента` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `оборудование`
--
ALTER TABLE `оборудование`
  MODIFY `код_оборудования` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `отдел`
--
ALTER TABLE `отдел`
  MODIFY `код_отдела` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `проект`
--
ALTER TABLE `проект`
  MODIFY `код_проекта` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `работа_сотрудника`
--
ALTER TABLE `работа_сотрудника`
  MODIFY `код_работы` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `работа_субподрядчика`
--
ALTER TABLE `работа_субподрядчика`
  MODIFY `код_проекта` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `сотрудники`
--
ALTER TABLE `сотрудники`
  MODIFY `код_сотрудника` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `субподрядчик`
--
ALTER TABLE `субподрядчик`
  MODIFY `код_субподрядчика` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `договор`
--
ALTER TABLE `договор`
  ADD CONSTRAINT `FKotirdf0alm12mvc96cx9hk8v1` FOREIGN KEY (`код_клиента`) REFERENCES `клиент` (`код_клиента`);

--
-- Constraints for table `оборудование`
--
ALTER TABLE `оборудование`
  ADD CONSTRAINT `FKaxs5n3xnrexr7wa9kv6eubm0b` FOREIGN KEY (`код_отдела`) REFERENCES `отдел` (`код_отдела`);

--
-- Constraints for table `оборудование_на_проекте`
--
ALTER TABLE `оборудование_на_проекте`
  ADD CONSTRAINT `FKh9v402471nqw0pthxyxqxusu6` FOREIGN KEY (`код_оборудования`) REFERENCES `оборудование` (`код_оборудования`),
  ADD CONSTRAINT `FKjgs3qwy3gb4ucys2e0h3fsjnv` FOREIGN KEY (`код_проекта`) REFERENCES `проект` (`код_проекта`);

--
-- Constraints for table `проект`
--
ALTER TABLE `проект`
  ADD CONSTRAINT `FK8melgt16pd91qy5vrls2xbi1p` FOREIGN KEY (`руководитель`) REFERENCES `сотрудники` (`код_сотрудника`),
  ADD CONSTRAINT `FKgpengrom9snsbj1ikvh6kaffa` FOREIGN KEY (`код_договора`) REFERENCES `договор` (`код_договора`);

--
-- Constraints for table `работа_сотрудника`
--
ALTER TABLE `работа_сотрудника`
  ADD CONSTRAINT `FK55vr7v9hq00138wn0ohfqaubc` FOREIGN KEY (`код_сотрудника`) REFERENCES `сотрудники` (`код_сотрудника`),
  ADD CONSTRAINT `FKrrdy4m6q3vyprj9selapphqwr` FOREIGN KEY (`код_проекта`) REFERENCES `проект` (`код_проекта`);

--
-- Constraints for table `работа_субподрядчика`
--
ALTER TABLE `работа_субподрядчика`
  ADD CONSTRAINT `FK3up20tcgfsw2qix58wvoks000` FOREIGN KEY (`код_проекта`) REFERENCES `проект` (`код_проекта`),
  ADD CONSTRAINT `FKp9gm4wdn5rcxa4lex8p50cppf` FOREIGN KEY (`код_субподрядчика`) REFERENCES `субподрядчик` (`код_субподрядчика`);

--
-- Constraints for table `сотрудники`
--
ALTER TABLE `сотрудники`
  ADD CONSTRAINT `FKhgey0llr48nox9u1lx5i4lk3h` FOREIGN KEY (`код_отдела`) REFERENCES `отдел` (`код_отдела`);

--
-- Constraints for table `сотрудники_на_проекте`
--
ALTER TABLE `сотрудники_на_проекте`
  ADD CONSTRAINT `FKm6n2wt7vpdvnfieaxf6f9o8th` FOREIGN KEY (`код_сотрудника`) REFERENCES `сотрудники` (`код_сотрудника`),
  ADD CONSTRAINT `FKq0b24b1udjjybtmlshc7uv997` FOREIGN KEY (`код_проекта`) REFERENCES `проект` (`код_проекта`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;