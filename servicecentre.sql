-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 09, 2018 at 07:30 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `servicecentre`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `BrandID` varchar(10) NOT NULL,
  `Brand` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`BrandID`, `Brand`) VALUES
('HND', 'Honda'),
('MTS', 'Mitsubishi'),
('NIS', 'Nissan'),
('TYT', 'Toyota');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustomerID` varchar(100) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `Telephone` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `itemoredereddetails`
--

CREATE TABLE `itemoredereddetails` (
  `ItemNo` varchar(100) NOT NULL,
  `OrderID` varchar(100) NOT NULL,
  `AvailableAmount` int(11) NOT NULL,
  `unitprice` double NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lubricants`
--

CREATE TABLE `lubricants` (
  `ItemNo` varchar(100) NOT NULL,
  `ItemName` varchar(100) NOT NULL,
  `Brand` varchar(100) NOT NULL,
  `Amount_L` varchar(100) NOT NULL,
  `Quantity` varchar(100) NOT NULL,
  `MovedStock` varchar(100) NOT NULL,
  `Price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lubricants`
--

INSERT INTO `lubricants` (`ItemNo`, `ItemName`, `Brand`, `Amount_L`, `Quantity`, `MovedStock`, `Price`) VALUES
('BREAKOIL0001', 'BreakOil', 'Caltex', '5', '20', '10', 1000),
('BREAKOIL0002', 'BreakOil', 'Caltex', '10', '2', '50', 1250),
('ENGOIl0001', 'EngineOil', 'Caltex', '10', '26.0', '58.0', 2000),
('ENGOIL002', 'EngineOil', 'Caltex', '2', '49.0', '1.0', 850);

-- --------------------------------------------------------

--
-- Table structure for table `mahindra`
--

CREATE TABLE `mahindra` (
  `Chassie_No` varchar(100) NOT NULL,
  `Model` varchar(100) NOT NULL,
  `Fuel_type` varchar(10) NOT NULL,
  `Color` varchar(10) NOT NULL,
  `Year` varchar(4) NOT NULL,
  `Price` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mainparts`
--

CREATE TABLE `mainparts` (
  `ItemNo` varchar(100) NOT NULL,
  `SparePartsName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mainparts`
--

INSERT INTO `mainparts` (`ItemNo`, `SparePartsName`) VALUES
('CARB000', 'Cabulator'),
('ENG000', 'Engine'),
('FT000', 'Filters');

-- --------------------------------------------------------

--
-- Table structure for table `purchasedetails`
--

CREATE TABLE `purchasedetails` (
  `OderID` int(100) NOT NULL,
  `ItemName` varchar(100) NOT NULL,
  `ModelID` varchar(100) NOT NULL,
  `OrderDate` date NOT NULL,
  `SupplierName` varchar(100) NOT NULL,
  `Unitcost` double NOT NULL,
  `Units` double NOT NULL,
  `TotalAmount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchasedetails`
--

INSERT INTO `purchasedetails` (`OderID`, `ItemName`, `ModelID`, `OrderDate`, `SupplierName`, `Unitcost`, `Units`, `TotalAmount`) VALUES
(3, 'AirFilters', 'MTS001', '2010-08-18', 'Sanjeeewa Motors', 2350, 50, 117500),
(4, 'OilFilters', 'MTS001', '2010-08-18', 'ASD Distributors', 590, 10, 5900),
(5, 'AirFilters', 'TYT005', '2010-09-18', 'Semni International', 1250, 50, 62500),
(6, 'OilFilters', 'MTS001', '2018-10-09', 'Select', 590, 50, 29500);

-- --------------------------------------------------------

--
-- Table structure for table `purchasedetailslub`
--

CREATE TABLE `purchasedetailslub` (
  `OderID` int(100) NOT NULL,
  `ItemName` varchar(100) NOT NULL,
  `Brand` varchar(100) NOT NULL,
  `Amount_L` varchar(100) NOT NULL,
  `OrderDate` date NOT NULL,
  `SupplierName` varchar(100) NOT NULL,
  `Unitcost` varchar(100) NOT NULL,
  `Units` varchar(100) NOT NULL,
  `TotalAmount` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `salesslub`
--

CREATE TABLE `salesslub` (
  `ItemNo` varchar(100) NOT NULL,
  `ItemName` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Amount_L` varchar(100) NOT NULL,
  `Units` varchar(100) NOT NULL,
  `UnitPrice` varchar(100) NOT NULL,
  `Total` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salesslub`
--

INSERT INTO `salesslub` (`ItemNo`, `ItemName`, `Date`, `Amount_L`, `Units`, `UnitPrice`, `Total`) VALUES
('ENGOIl0001', 'EngineOil', '0000-00-00', '', '1', '2500.0', '2500.0'),
('ENGOIl0001', 'EngineOil', '0000-00-00', '', '5', '2500.0', '12500.0'),
('ENGOIl0001', 'EngineOil', '0000-00-00', '10', '5', '2500.0', '12500.0'),
('ENGOIl0001', 'EngineOil', '0000-00-00', '', '5', '2500.0', '12500.0'),
('ENGOIl0001', 'EngineOil', '0000-00-00', '', '3', '2500.0', '7500.0'),
('ENGOIl0001', 'EngineOil', '2010-06-18', '', '5', '2500.0', '12500.0'),
('ENGOIL002', 'EngineOil', '2018-10-09', '2', '1', '1350.0', '1350.0');

-- --------------------------------------------------------

--
-- Table structure for table `salesspare`
--

CREATE TABLE `salesspare` (
  `ItemNo` varchar(100) NOT NULL,
  `ItemName` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Units` varchar(100) NOT NULL,
  `UnitPrice` varchar(100) NOT NULL,
  `TotalCost` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salesspare`
--

INSERT INTO `salesspare` (`ItemNo`, `ItemName`, `Date`, `Units`, `UnitPrice`, `TotalCost`) VALUES
('AIRFT0001', 'AirFilters', '0000-00-00', '2', '1950.0', '3900.0'),
('AIRFT0002', 'AirFilters', '0000-00-00', '5', '1750.0', '8750.0'),
('AIRFT0001', 'AirFilters', '0000-00-00', '5', '1950.0', '9750.0'),
('AIRFT0002', 'AirFilters', '0000-00-00', '5', '1750.0', '8750.0'),
('AIRFT0003', 'AirFilters', '0000-00-00', '2', '2340.0', '4680.0'),
('FUELFT0001', 'FuelFilters', '0000-00-00', '5', '2850.0', '14250.0'),
('AIRFT0001', 'AirFilters', '0000-00-00', '5', '1950.0', '9750.0'),
('AIRFT0001', 'AirFilters', '0000-00-00', '5', '1750.0', '8750.0'),
('AIRFT0002', 'AirFilters', '2010-07-18', '1', '1750.0', '1750.0'),
('AIRFT0001', 'AirFilters', '2010-07-18', '5', '1950.0', '9750.0'),
('AIRFT0001', 'AirFilters', '2010-07-18', '5', '1950.0', '9750.0'),
('FUELFT0001', 'FuelFilters', '2010-07-18', '10', '2850.0', '28500.0'),
('AIRFT0001', 'AirFilters', '2010-07-18', '5', '1950.0', '9750.0'),
('FUELFT0001', 'FuelFilters', '2010-07-18', '10', '2850.0', '28500.0'),
('FUELFT0001', 'FuelFilters', '2010-08-18', '10', '2850.0', '28500.0'),
('AIRFT0002', 'AirFilters', '2018-10-09', '10', '1750.0', '17500.0'),
('FUELFT0001', 'FuelFilters', '2018-10-09', '5', '2850.0', '14250.0'),
('AIRFT0003', 'AirFilters', '2018-10-09', '5', '2340.0', '11700.0');

-- --------------------------------------------------------

--
-- Table structure for table `subpartname`
--

CREATE TABLE `subpartname` (
  `MainPartID` varchar(100) NOT NULL,
  `ItemID` varchar(100) NOT NULL,
  `ItemName` varchar(100) NOT NULL,
  `ModelID` varchar(100) NOT NULL,
  `Quanty` varchar(100) NOT NULL,
  `movedItems` varchar(100) NOT NULL,
  `Cost` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subpartname`
--

INSERT INTO `subpartname` (`MainPartID`, `ItemID`, `ItemName`, `ModelID`, `Quanty`, `movedItems`, `Cost`) VALUES
('FT000', 'AIRFT0001', 'AirFilters', 'TYT001', '16.0', '50.0', '1450'),
('FT000', 'AIRFT0002', 'AirFilters', 'TYT005', '42.0', '28.0', '1250'),
('FT000', 'AIRFT0003', 'AirFilters', 'MTS001', '46.0', '17.0', '1840'),
('FT000', 'FUELFT0001', 'FuelFilters', 'TYT001', '20.0', '42.0', '2350'),
('FT000', 'FUELFT0002', 'FuelFilters', 'MTS001', '20.0', '', '845'),
('FT000', 'OILFT0001', 'OilFilters', 'TYT001', '55.0', '', '575'),
('FT000', 'OILFT0002', 'OilFilters', 'MTS001', '62.0', '', '590');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `SupplierID` int(10) NOT NULL,
  `CompanyName` varchar(100) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Telephone` varchar(10) NOT NULL,
  `email` varchar(200) NOT NULL,
  `AgentName` varchar(100) NOT NULL,
  `AgentContact` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`SupplierID`, `CompanyName`, `Type`, `Address`, `Telephone`, `email`, `AgentName`, `AgentContact`) VALUES
(1, 'ASD Distributors', 'Spare Parts', 'Kegalle', '0112119119', 'asd@gmail.com', 'Saman Kumara', '0711231234'),
(5, 'Sanjeewa Motors', 'Both ', 'Kegalle', '0352222273', 'sanjeewa@gmail.com', 'Gayan Rajapaksha', '0711081912'),
(8, 'Semni International', 'Spare Parts ', 'Colombo 16', '0112564457', 'semni@yahoomail.com', 'Samud Udana', '0756841238'),
(9, 'Caltex Lanka', 'Lubricants ', 'Colombo,SriLanka', '0112852463', 'caltexlanka@gmail.com', 'Dulpa Umesh', '0717911125'),
(10, 'Chinese Lubs', 'Lubricants ', 'Hambantota', '0274561235', 'chineselub@gmail.com', 'Ishan Pamodya', '0716954863'),
(11, 'WholeSale Sellers', 'Both ', 'Sooriyawewa', '0278967412', 'wholesale@yahoomail.com', 'Hasun Samarajeewa', '0786542495'),
(12, 'Sakura Distributors', 'Spare Parts ', 'Panchikawatta road,Colombo 16', '012344480', 'sakdistributors@gmail.com', 'Ishan Mantilake', '0776345741'),
(13, 'ABC Motors', 'Both ', 'Sooriyawewa, Hambantota', '027951486', 'abc@yahoomail.com', 'Kanchana Senevirathne', '0716541793'),
(14, 'Silva Motors', 'Spare Parts ', 'Kuliyapitiya', '0378516372', 'silavmtrs@hotmail.com', 'Roshan Fernando', '0712354698');

-- --------------------------------------------------------

--
-- Table structure for table `threewheeler`
--

CREATE TABLE `threewheeler` (
  `Chassie_No` varchar(100) NOT NULL,
  `Model` varchar(100) NOT NULL,
  `Fuel_type` varchar(10) NOT NULL,
  `Color` varchar(100) NOT NULL,
  `Year` varchar(4) NOT NULL,
  `Price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `NIC` varchar(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Usernmae` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`NIC`, `Name`, `Usernmae`, `Password`) VALUES
('931720935v', 'Ravindu Ranatunga', 'Ravi', 'test123'),
('941720935v', 'Jayantha Wannigama', 'Jayantha', 'jayantha12');

-- --------------------------------------------------------

--
-- Table structure for table `vehicletype`
--

CREATE TABLE `vehicletype` (
  `ModelID` varchar(50) NOT NULL,
  `Brand` varchar(50) NOT NULL,
  `Model` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicletype`
--

INSERT INTO `vehicletype` (`ModelID`, `Brand`, `Model`) VALUES
('MTS001', 'Mitsubishi', 'Lancer'),
('MTS002', 'Mitsubishi', 'OutLander'),
('TYT001', 'Toyota', 'Corolla'),
('TYT002', 'Toyota', 'Axio'),
('TYT003', 'Toyota', 'Premio'),
('TYT004', 'Toyota', 'Prius'),
('TYT005', 'Toyota', 'Aqua'),
('TYT006', 'Toyota', 'Vitz');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`BrandID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `itemoredereddetails`
--
ALTER TABLE `itemoredereddetails`
  ADD PRIMARY KEY (`ItemNo`,`OrderID`);

--
-- Indexes for table `lubricants`
--
ALTER TABLE `lubricants`
  ADD PRIMARY KEY (`ItemNo`);

--
-- Indexes for table `mahindra`
--
ALTER TABLE `mahindra`
  ADD PRIMARY KEY (`Chassie_No`);

--
-- Indexes for table `mainparts`
--
ALTER TABLE `mainparts`
  ADD PRIMARY KEY (`ItemNo`);

--
-- Indexes for table `purchasedetails`
--
ALTER TABLE `purchasedetails`
  ADD PRIMARY KEY (`OderID`,`ItemName`);

--
-- Indexes for table `purchasedetailslub`
--
ALTER TABLE `purchasedetailslub`
  ADD PRIMARY KEY (`OderID`,`ItemName`);

--
-- Indexes for table `subpartname`
--
ALTER TABLE `subpartname`
  ADD PRIMARY KEY (`MainPartID`,`ItemID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`SupplierID`);

--
-- Indexes for table `threewheeler`
--
ALTER TABLE `threewheeler`
  ADD PRIMARY KEY (`Chassie_No`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `vehicletype`
--
ALTER TABLE `vehicletype`
  ADD PRIMARY KEY (`ModelID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `purchasedetails`
--
ALTER TABLE `purchasedetails`
  MODIFY `OderID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `purchasedetailslub`
--
ALTER TABLE `purchasedetailslub`
  MODIFY `OderID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `SupplierID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
