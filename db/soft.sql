-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 28, 2022 at 10:14 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `software`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `ClientID` varchar(10) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `Telno` int(15) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `Age` int(5) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `Admission_Date` date NOT NULL,
  `Project_Type` varchar(50) NOT NULL,
  `Emp_ID` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`ClientID`, `Name`, `Telno`, `Gender`, `Age`, `NIC`, `Email`, `Address`, `Admission_Date`, `Project_Type`, `Emp_ID`) VALUES
('cli1', 'Sarafath', 765760557, 'Male', 23, '992271582V', 'sara$5@gmail.com', 'Kalmunai', '2022-12-28', 'Brandnew', 'pro2'),
('clio2', 'sampl', 724424, 'Male', 22, '21442442', 'zdkj242', 'dfddg', '2022-12-28', 'Repair', 'pro1');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmpID` varchar(16) NOT NULL,
  `Name` varchar(66) DEFAULT NULL,
  `Tel` int(10) DEFAULT NULL,
  `gender` varchar(20) NOT NULL,
  `age` int(5) DEFAULT NULL,
  `NIC` varchar(15) DEFAULT NULL,
  `Emp_Type` varchar(15) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `Joined_Date` date NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpID`, `Name`, `Tel`, `gender`, `age`, `NIC`, `Emp_Type`, `salary`, `Joined_Date`, `username`, `password`, `Status`) VALUES
('ad1', 'Afsir', 774229135, 'Male', 23, '995432511234V', 'Admin', 30000, '2018-12-01', 'af', '123', 'working'),
('pro1', 'K.M.Zifan', 757052361, 'Male', 22, '200021003325', 'Project manager', 15000, '2021-06-01', 'zif', '123', 'working'),
('pro2', 'M.I.M.Insath', 750552243, 'Male', 24, '972511056V', 'Project manager', 17000, '2020-01-12', 'ins', '123', 'working'),
('pro3', 'M.A.M.Afsir', 774229135, 'Male', 23, '991333142V', 'Project manager', 16000, '2021-12-02', 'afsir', '123', 'available'),
('recep1', 'M.H.M.SHOOJATH', 757627978, 'Male', 23, '992506245V', 'Receptionist', 10000, '2021-12-01', 'shoo', '123', 'available');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `ProjectID` varchar(16) NOT NULL,
  `title` varchar(50) NOT NULL,
  `AcceptDate` date NOT NULL,
  `Update_Date` date DEFAULT NULL,
  `Project_Requirements` varchar(68) NOT NULL,
  `SubmitDate` date NOT NULL,
  `Amount` double NOT NULL,
  `ClientID` varchar(16) NOT NULL,
  `PMID` varchar(16) NOT NULL,
  `TeamID` varchar(16) NOT NULL,
  `Client_Feedback` varchar(255) DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL,
  `FinalBill` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`ProjectID`, `title`, `AcceptDate`, `Update_Date`, `Project_Requirements`, `SubmitDate`, `Amount`, `ClientID`, `PMID`, `TeamID`, `Client_Feedback`, `Status`, `FinalBill`) VALUES
('Pro1', 'GYM MANAGEMENT SYSTEM', '2022-12-28', '2023-07-03', 'We need user satisfaction user interace', '2023-01-02', 12000, 'cli1', 'pro2', 'team1', 'satisfied', 'design', 26280),
('project1', 'hotle managent system', '2022-12-28', '2023-06-15', 'good looking interface.1login', '2023-06-01', 15000, 'clio2', 'pro1', 'team2', 'ok', 'ddesiging', 23200);

-- --------------------------------------------------------

--
-- Table structure for table `projectteam`
--

CREATE TABLE `projectteam` (
  `TeamID` varchar(16) NOT NULL,
  `Team_Name` varchar(50) NOT NULL,
  `Team_Members` int(15) NOT NULL,
  `Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `projectteam`
--

INSERT INTO `projectteam` (`TeamID`, `Team_Name`, `Team_Members`, `Status`) VALUES
('team1', 'Hashcore', 6, 'working'),
('team2', 'Cobra', 4, 'working'),
('team3', 'Vikings', 10, 'available'),
('team4', 'Spartans', 9, 'available'),
('team5', 'Rolex', 7, 'available'),
('teamo2', 'hhh', 15, 'available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`ClientID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`ProjectID`);

--
-- Indexes for table `projectteam`
--
ALTER TABLE `projectteam`
  ADD PRIMARY KEY (`TeamID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
