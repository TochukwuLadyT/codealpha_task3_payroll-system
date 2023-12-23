-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2023 at 08:17 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int(11) NOT NULL,
  `employeeId` varchar(255) DEFAULT NULL,
  `employeeFullName` varchar(255) DEFAULT NULL,
  `employeeEmail` varchar(255) DEFAULT NULL,
  `status` varchar(400) DEFAULT NULL,
  `attendance_date` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `employeeId` varchar(255) DEFAULT NULL,
  `employeeFullName` varchar(255) DEFAULT NULL,
  `employeeEmail` varchar(255) DEFAULT NULL,
  `department` varchar(100) DEFAULT NULL,
  `employeePhone` varchar(400) DEFAULT NULL,
  `basicSalary` varchar(400) DEFAULT NULL,
  `transportAllowance` int(10) DEFAULT NULL,
  `healthAllowance` int(10) DEFAULT NULL,
  `leaveAllowance` int(10) DEFAULT NULL,
  `dateOfJoining` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `employeelogindetails`
--

CREATE TABLE `employeelogindetails` (
  `id` int(11) NOT NULL,
  `employeeId` varchar(255) DEFAULT NULL,
  `password` varchar(400) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `leave_request`
--

CREATE TABLE `leave_request` (
  `id` int(11) NOT NULL,
  `employeeId` varchar(255) DEFAULT NULL,
  `purpose` varchar(400) DEFAULT NULL,
  `start_date` varchar(50) DEFAULT NULL,
  `stop_date` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `paidsalary`
--

CREATE TABLE `paidsalary` (
  `id` int(11) NOT NULL,
  `employeeId` varchar(255) DEFAULT NULL,
  `employeeFullName` varchar(255) DEFAULT NULL,
  `department` varchar(400) DEFAULT NULL,
  `daysPresent` int(10) DEFAULT NULL,
  `basSalary` varchar(100) DEFAULT NULL,
  `transport` varchar(100) DEFAULT NULL,
  `health` varchar(100) DEFAULT NULL,
  `leave` varchar(100) DEFAULT NULL,
  `grosspay` varchar(100) DEFAULT NULL,
  `tax` varchar(100) DEFAULT NULL,
  `deduction` varchar(100) DEFAULT NULL,
  `paid` varchar(100) DEFAULT NULL,
  `datFrom` varchar(400) DEFAULT NULL,
  `datTo` varchar(400) DEFAULT NULL,
  `datePaid` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `employeeId` (`employeeId`),
  ADD UNIQUE KEY `employeeEmail` (`employeeEmail`);

--
-- Indexes for table `employeelogindetails`
--
ALTER TABLE `employeelogindetails`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `leave_request`
--
ALTER TABLE `leave_request`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `paidsalary`
--
ALTER TABLE `paidsalary`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employeelogindetails`
--
ALTER TABLE `employeelogindetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `leave_request`
--
ALTER TABLE `leave_request`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `paidsalary`
--
ALTER TABLE `paidsalary`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
